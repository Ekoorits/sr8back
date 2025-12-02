package ee.team.sr8back.persistence.user;

import ee.team.sr8back.controller.login.dto.LoginResponse;
import ee.team.sr8back.controller.user.dto.NewUserRequest;
import org.mapstruct.*;
import ee.team.sr8back.infrastructure.RoleEnum;
import ee.team.sr8back.infrastructure.Status;
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", imports = {RoleEnum.class, Status.class})
public interface UserMapper {

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.name", target = "roleName")
    @Mapping(source = "username", target = "userName")
    LoginResponse toLoginResponse(User user);

    @Mapping(expression = "java(RoleEnum.CUSTOMER.getCode())",target = "role.id")
    @Mapping(source = "username",target = "username")
    @Mapping(source = "password",target = "password")
    @Mapping(expression = "java(Status.ACTIVE.getCode())",target = "status")
    User toUser(NewUserRequest newUserRequest);

}