package ee.team.sr8back.persistence.user;

import ee.team.sr8back.controller.login.dto.LoginResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")

public interface UserMapper {

    @Mapping(source = "id",target = "userId")
    @Mapping(source = "role.name",target = "roleName")
    @Mapping(source = "username",target = "userName")
    LoginResponse toLoginResponse (User user);
}