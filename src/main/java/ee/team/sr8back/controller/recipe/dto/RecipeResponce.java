package ee.team.sr8back.controller.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RecipeResponce {
    private Integer recipeId;
    private String name;
    private Integer pax;
    private String author;
}
