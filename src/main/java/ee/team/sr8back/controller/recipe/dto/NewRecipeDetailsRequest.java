package ee.team.sr8back.controller.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewRecipeDetailsRequest {

    private String recipeName;
    private String authorName;
    private String mealType;
    private Integer difficultyLevelNumber;
    private Integer cookingTimeId;
    private Integer pax;
    private String instructions;
    private String imageData;

}
