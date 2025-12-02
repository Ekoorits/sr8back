package ee.team.sr8back.service;

import ee.team.sr8back.controller.login.dto.LoginResponse;
import ee.team.sr8back.persistence.user.User;
import ee.team.sr8back.persistence.user.UserMapper;
import ee.team.sr8back.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public LoginResponse login(String username, String password) {
        User user = getValidActiveUserBy(username, password);
        return userMapper.toLoginResponse(user);
    }

    private User getValidActiveUserBy(String username, String password) {
        return userRepository.findActiveUserBy(username, password)
                .orElseThrow(() -> new ExpressionException("Error", "sdaad"));
    }
}
