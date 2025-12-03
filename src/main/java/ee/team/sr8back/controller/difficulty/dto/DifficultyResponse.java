package ee.team.sr8back.controller.difficulty.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DifficultyResponse {
    private Integer difficultyId;
    private String difficultyLevelName;
}
