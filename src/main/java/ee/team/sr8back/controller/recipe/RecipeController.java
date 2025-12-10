package ee.team.sr8back.controller.recipe;

import ee.team.sr8back.controller.recipe.dto.NewRecipeDetailsRequest;
import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import ee.team.sr8back.controller.recipe.dto.UserRecipeResponse;
import ee.team.sr8back.service.RecipeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping("/recipe/detail")
    @Operation(summary = "Salvestab uue retsepti detailid andmebaasi ja tagastab recipeId")
    public Integer addNewRecipeDetails(@RequestBody NewRecipeDetailsRequest newRecipeDetails) {
        return recipeService.addNewRecipeDetails(newRecipeDetails);
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

    @GetMapping("/my-recipes")
    @Operation(summary = "Tagastab kõik kasutaja lisatud retseptid myRecipes vaatel vastavalt userId-le")
    public List<UserRecipeResponse> findRecipesBy(@RequestParam Integer userId) {
        return recipeService.findRecipesBy(userId);

    }
}
