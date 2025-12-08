package ee.team.sr8back.controller.recipeingredient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeIngredientResponse {

    private String recipeIngredientName;
    private Integer recipeIngredientAmount;
    private String recipeIngredientMeasureUnit;
    private String recipeIngredientDescription;
}
