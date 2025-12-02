package ee.team.sr8back.controller.user;

import ee.team.sr8back.controller.user.dto.UserInfo;
import ee.team.sr8back.persistence.contact.Contact;
import ee.team.sr8back.persistence.user.User;
import ee.team.sr8back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public void addNewUser(@RequestBody UserInfo userInfo){
        userService.addNewUser(userInfo);
    }
}
