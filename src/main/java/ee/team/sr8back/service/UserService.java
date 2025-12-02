package ee.team.sr8back.service;

import ee.team.sr8back.controller.user.dto.UserInfo;
import ee.team.sr8back.persistence.contact.Contact;
import ee.team.sr8back.persistence.user.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService {

    public void addNewUser (User user, Contact contact) {


    }

@Transactional

    public void addNewUser(UserInfo userInfo) {
        User user = new User();
        user.setRole();
        user.setUsername(userInfo.getUsername());
    }
}
