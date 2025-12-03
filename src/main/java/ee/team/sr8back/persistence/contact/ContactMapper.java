package ee.team.sr8back.persistence.contact;

import ee.team.sr8back.controller.user.dto.NewUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    Contact toContact(NewUserRequest newUserRequest);

}
