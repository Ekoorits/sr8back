package ee.team.sr8back.controller.recipe;

import ee.team.sr8back.persistence.recipe.Recipe;
import ee.team.sr8back.service.RecipeService;
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

    public List<Recipe> findRecipesBy(@RequestParam String searchParam) {
        return recipeService.findRecipesBy(searchParam);
    }
}
