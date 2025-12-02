package ee.team.sr8back.service;

import ee.team.sr8back.controller.user.dto.UserInfo;
import ee.team.sr8back.persistence.contact.Contact;
import ee.team.sr8back.persistence.role.RoleRepository;
import ee.team.sr8back.persistence.user.User;
import ee.team.sr8back.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    @Transactional
    public void addNewUser(UserInfo userInfo) {

        User user = new User();
        user.setRole(roleRepository.getRoleById(3));
        user.setUsername(userInfo.getUsername());
        // TODO: vb põhjustab probleemi Integer.valuOf...
        user.setPassword(Integer.valueOf(userInfo.getPassword()));
        // TODO: tee globaalne staatuse ENUM
        user.setStatus("A");
        userRepository.save(user);

    }
}
