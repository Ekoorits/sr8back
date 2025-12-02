package ee.team.sr8back.controller.user.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class NewUserRequest {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
}
