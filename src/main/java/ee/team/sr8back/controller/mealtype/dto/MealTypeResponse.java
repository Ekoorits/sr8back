package ee.team.sr8back.controller.mealtype.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MealTypeResponse {
    private Integer mealTypeId;
    private String mealTypeName;
}
