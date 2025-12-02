package ee.team.sr8back.infrastructure;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE("A"),
    SOFT_DELETED("D");

    private final String code;

    Status(String code) {
        this.code=code;
    }
}
