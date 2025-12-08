package ee.team.sr8back.service;

import ee.team.sr8back.controller.user.dto.NewUserRequest;
import ee.team.sr8back.infrastructure.exception.ForbiddenException;
import ee.team.sr8back.persistence.contact.Contact;
import ee.team.sr8back.persistence.contact.ContactMapper;
import ee.team.sr8back.persistence.contact.ContactRepository;
import ee.team.sr8back.persistence.role.Role;
import ee.team.sr8back.persistence.role.RoleRepository;
import ee.team.sr8back.persistence.user.User;
import ee.team.sr8back.persistence.user.UserMapper;
import ee.team.sr8back.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static ee.team.sr8back.infrastructure.error.Error.USERNAME_EXISTS;

@Service
@RequiredArgsConstructor
public class UserService {

    public static final String CUSTOMER_ROLE_NAME = "customer";
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;


    @Transactional
    public void addNewUser(NewUserRequest newUserRequest) {
        validateUsernameIsAvailable(newUserRequest.getUsername());
        User user = createAndSaveUser(newUserRequest);
        createAndSaveContact(newUserRequest, user);
    }

    private void validateUsernameIsAvailable(String username) {
        boolean usernameExists = userRepository.usernameExistsBy(username);
        if (usernameExists) {
            throw new ForbiddenException(USERNAME_EXISTS.getMessage(), USERNAME_EXISTS.getErrorCode());
        }
    }

    private User createAndSaveUser(NewUserRequest newUserRequest) {
        User user = createNewUser(newUserRequest);
        userRepository.save(user);
        return user;
    }

    private User createNewUser(NewUserRequest newUserRequest) {
        Role role = roleRepository.getRoleBy(CUSTOMER_ROLE_NAME);
        User user = userMapper.toUser(newUserRequest);
        user.setRole(role);
        return user;
    }

    private void createAndSaveContact(NewUserRequest newUserRequest, User user) {
        Contact contact = createNewContact(newUserRequest, user);
        contactRepository.save(contact);
    }


    private Contact createNewContact(NewUserRequest newUserRequest, User user) {
        Contact contact = contactMapper.toContact(newUserRequest);
        contact.setUser(user);
        return contact;
    }

}
