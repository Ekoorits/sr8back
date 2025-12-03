package ee.team.sr8back.service;

import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import ee.team.sr8back.persistence.cookingtime.CookingTime;
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
    private final CookingTimeService cookingTimeService;

    public List<RecipeResponse> findRecipesBy(String searchParam) {
        List<Recipe> recipes = recipeRepository.findRecipesBy(searchParam);
        return recipeMapper.toRecipes(recipes);
    }

    public List<RecipeResponse> findRecipesBy(Integer mealTypeId, Integer difficultyId, Integer cookingTimeId) {
        Integer difficultyLevelNumber = difficultyService.getDifficultyLevelNumber(difficultyId);

        Integer cookingTimeMinutesMax = cookingTimeService.getCookingTimeMinutesMax(cookingTimeId);

        List<Recipe> recipes = recipeRepository.findRecipesBy(mealTypeId, difficultyLevelNumber, cookingTimeMinutesMax);
        return recipeMapper.toRecipes(recipes);
    }

}
