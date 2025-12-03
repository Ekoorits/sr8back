package ee.team.sr8back.controller.cookingtime.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CookingTimeResponse {
    private Integer cookingTimeId;
    private Integer cookingTimeMinutesMax;

}
