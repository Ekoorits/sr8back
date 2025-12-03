package ee.team.sr8back.service;

import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import ee.team.sr8back.persistence.difficulty.Difficulty;
import ee.team.sr8back.persistence.recipe.Recipe;
import ee.team.sr8back.persistence.recipe.RecipeMapper;
import ee.team.sr8back.persistence.recipe.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;
    private final DifficultyService difficultyService;

    public List<RecipeResponse> findRecipesBy(String searchParam) {
        List<Recipe> recipes = recipeRepository.findRecipesBy(searchParam);
        return recipeMapper.toRecipes(recipes);
    }

    public List<RecipeResponse> findRecipesBy(Integer mealTypeId, Integer dificultyId, Integer cookingTimeId) {

        Difficulty difficulty = difficultyService.getValidDifficulty(dificultyId);
        Integer levelNumber = difficulty.getLevelNumber();

        List<Recipe> recipes = recipeRepository.findRecipesBy(mealTypeId,dificultyId,cookingTimeId);
        return recipeMapper.toRecipes(recipes);

    }

}
