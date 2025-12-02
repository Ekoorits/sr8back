package ee.team.sr8back.service;

import ee.team.sr8back.persistence.recipe.Recipe;
import ee.team.sr8back.persistence.recipe.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class RecipeService {
    private final RecipeRepository recipeRepository;

    public List<Recipe> findRecipesBy(String searchParam) {
        return recipeRepository.findRecipeBy(searchParam);
    }

}
