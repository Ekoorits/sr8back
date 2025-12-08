package ee.team.sr8back.controller.recipe;

import ee.team.sr8back.controller.recipe.dto.NewRecipeDetailsRequest;
import ee.team.sr8back.controller.recipe.dto.NewRecipeIngredientsRequest;
import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import ee.team.sr8back.service.RecipeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping("/recipe/detail/add")
    @Operation(summary = "Salvestab uue retsepti detailid andmebaasi")
    public void addNewRecipeDetails(@RequestBody NewRecipeDetailsRequest newRecipeDetails) {
        recipeService.addNewRecipeDetails(newRecipeDetails);
    }

    @PostMapping("/recipe")
    @Operation(summary = "Uue retsepti tegemisel, lisab valitud koostisosa uue retsepti külge ja salvestab andmebaasi")
    public void addNewRecipeIngredient(@RequestParam Integer recipeId, @RequestBody NewRecipeIngredientsRequest newRecipeIngredientsRequest) {
        recipeService.addNewRecipeIngredients(newRecipeIngredientsRequest, recipeId);
    }

    @GetMapping("/recipes")
    @Operation(summary = "Tagastab listi retseptidest, mis on sorteeritud kasutaja sisestatud keywordiga")
    public List<RecipeResponse> findRecipesBy(@RequestParam String searchParam) {
        return recipeService.findRecipesBy(searchParam);
    }

    @GetMapping("/recipes/filter")
    @Operation(summary = "Tagastab filtreeritud retseptid vastavalt kasutaja sisestatud filtritele")
    public List<RecipeResponse> findRecipesBy(@RequestParam Integer mealTypeId, @RequestParam Integer difficultyId, @RequestParam Integer cookingTimeId) {
        return recipeService.findRecipesBy(mealTypeId, difficultyId, cookingTimeId);
    }
}
