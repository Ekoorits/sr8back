package ee.team.sr8back.controller.login;

import ee.team.sr8back.controller.login.dto.LoginResponse;
import ee.team.sr8back.service.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login")
    @Operation (summary = "Sisse logimine, tagastab userId,roleName ja userName")

    public LoginResponse login (@RequestParam String username, @RequestParam String password) {
       return loginService.login(username, password);
    }
}
