package ee.team.sr8back.controller.recipeingredient;

import ee.team.sr8back.controller.recipeingredient.dto.RecipeIngredientResponse;
import ee.team.sr8back.service.RecipeIngredientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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
    public void deleteRecipeIngredient(@RequestParam Integer recipeIngredientId) {
        recipeIngredientService.deleteRecipeIngredient(recipeIngredientId);
    }

    @PostMapping("/recipe/ingredient")
    @Operation(summary = "Uue retsepti tegemisel, lisab valitud koostisosa uue retsepti külge ja salvestab andmebaasi")
    public void addRecipeIngredient(@RequestParam Integer recipeId,@RequestParam Integer ingredientId, @RequestParam BigDecimal ingredientAmount ) {
        recipeIngredientService.addRecipeIngredient(recipeId, ingredientId, ingredientAmount);
    }
}
