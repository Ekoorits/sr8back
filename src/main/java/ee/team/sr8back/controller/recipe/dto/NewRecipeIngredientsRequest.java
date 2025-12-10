package ee.team.sr8back.controller.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewRecipeIngredientsRequest {
    private Integer ingredientId;
    private String ingredientName;
    private Integer ingredientAmount;
    private String ingredientDescription;
}
