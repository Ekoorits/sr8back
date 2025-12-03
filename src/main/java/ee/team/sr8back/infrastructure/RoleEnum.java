package ee.team.sr8back.infrastructure;

import lombok.Getter;

@Getter
public enum RoleEnum {

    ADMIN(1),
    MODERATOR(2),
    CUSTOMER(3);

    private final Integer code;

    RoleEnum(Integer code) {
        this.code = code;
    }

}
