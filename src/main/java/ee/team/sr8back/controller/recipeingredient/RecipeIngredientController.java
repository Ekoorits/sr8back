package ee.team.sr8back.controller.recipeingredient;

import ee.team.sr8back.controller.recipeingredient.dto.RecipeIngredientResponse;
import ee.team.sr8back.service.RecipeIngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipeIngredientController {

    private final RecipeIngredientService recipeIngredientService;

    @GetMapping("/recipe/ingredients")
    public List<RecipeIngredientResponse> findAllRecipeIngredients(@RequestParam Integer recipeId) {
        return recipeIngredientService.findAllRecipeIngredients(recipeId);
    }

    @DeleteMapping("/recipe/ingredient")
    public void deleteRecipeIngredient(@RequestParam Integer recipeId, @RequestParam Integer recipeIngredientId) {
        recipeIngredientService.deleteRecipeIngredient(recipeIngredientId);
    }
}
