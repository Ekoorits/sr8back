package ee.team.sr8back.persistence.user;

import ee.team.sr8back.controller.login.dto.LoginResponse;
import ee.team.sr8back.controller.user.dto.NewUserRequest;
import ee.team.sr8back.infrastructure.status.Status;
import org.mapstruct.*;

@Mapper(componentModel = "spring", imports = {Status.class})
public interface UserMapper {

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.name", target = "roleName")
    @Mapping(source = "username", target = "userName")
    LoginResponse toLoginResponse(User user);

    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    @Mapping(expression = "java(Status.ACTIVE.getCode())", target = "status")
    User toUser(NewUserRequest newUserRequest);



}