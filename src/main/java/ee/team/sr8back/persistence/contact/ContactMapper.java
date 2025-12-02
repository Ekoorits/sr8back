package ee.team.sr8back.persistence.contact;

import ee.team.sr8back.controller.user.dto.NewUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    @Mapping(source = "firstname", target = "firstName")
    @Mapping(source = "lastname", target = "lastName")
    @Mapping(source = "email", target = "email")

    Contact toContact(NewUserRequest newUserRequest);


}
