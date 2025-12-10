package ee.team.sr8back.controller.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRecipeResponse {
    private Integer recipeId;
    private String recipeName;
    private String recipeImage;

}
