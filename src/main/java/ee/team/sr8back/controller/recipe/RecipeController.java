package ee.team.sr8back.controller.recipe;

import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import ee.team.sr8back.service.RecipeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping("/recipes")
    @Operation(summary = "Tagastab listi retseptidest, mis on sorteeritud kasutaja sisestatud keywordiga")
    public List<RecipeResponse> findRecipesBy(@RequestParam String searchParam) {
        return recipeService.findRecipesBy(searchParam);
    }

    @GetMapping("/recipes")
    @Operation(summary = "Tagastab filtreeritud retseptidest, mis on sorteeritud kasutaja sisestatud filtridele")
    public List<RecipeResponse> findRecipesBy(@RequestParam Integer mealTypeId, @RequestParam Integer dificultyId, @RequestParam Integer cookingTimeId) {
        return recipeService.findRecipesBy(mealTypeId,dificultyId,cookingTimeId);
    }
}
