package ee.team.sr8back.service;

import ee.team.sr8back.controller.user.dto.NewUserRequest;
import ee.team.sr8back.infrastructure.RoleEnum;
import ee.team.sr8back.infrastructure.Status;
import ee.team.sr8back.persistence.contact.Contact;
import ee.team.sr8back.persistence.contact.ContactMapper;
import ee.team.sr8back.persistence.contact.ContactRepository;
import ee.team.sr8back.persistence.role.RoleRepository;
import ee.team.sr8back.persistence.user.User;
import ee.team.sr8back.persistence.user.UserMapper;
import ee.team.sr8back.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    @Transactional
    public void addNewUser (NewUserRequest newUserRequest) {

        User user = userMapper.toUser(newUserRequest);
        user.setRole(roleRepository.getRoleById(RoleEnum.CUSTOMER.getCode()));
        user.setUsername(newUserRequest.getUsername());
        // TODO: vb põhjustab probleemi Integer.valuOf...
        user.setPassword(newUserRequest.getPassword());
        // TODO: tee globaalne staatuse ENUM
        user.setStatus(Status.ACTIVE.getCode());
        userRepository.save(user);

        Contact contact = contactMapper.toContact(newUserRequest);
        contact.setUser(userRepository.findActiveUserBy(user.getUsername(),user.getPassword()).orElseThrow());
        contact.setFirstName(newUserRequest.getFirstname());
        contact.setLastName(newUserRequest.getLastname());
        contact.setEmail(newUserRequest.getEmail());
        contactRepository.save(contact);

    }
}
