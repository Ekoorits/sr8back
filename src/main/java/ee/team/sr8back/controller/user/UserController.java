package ee.team.sr8back.controller.user;

import ee.team.sr8back.controller.user.dto.NewUserRequest;
import ee.team.sr8back.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    @Operation(summary = "Uue kasutaja lisamine user ja contact tabelisse")
    public void addNewUser(@RequestBody NewUserRequest newUserRequest){
        userService.addNewUser(newUserRequest);
    }
}
