package ee.team.sr8back.service;

import ee.team.sr8back.controller.recipe.dto.NewRecipeDetailsRequest;
import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import ee.team.sr8back.infrastructure.util.BytesConverter;
import ee.team.sr8back.persistence.recipe.Recipe;
import ee.team.sr8back.persistence.recipe.RecipeMapper;
import ee.team.sr8back.persistence.recipe.RecipeRepository;
import ee.team.sr8back.persistence.recipeimage.RecipeImage;
import ee.team.sr8back.persistence.recipeimage.RecipeImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;
    private final DifficultyService difficultyService;
    private final CookingTimeService cookingTimeService;
    private final RecipeImageRepository recipeImageRepository;

    @Transactional
    public void addNewRecipeDetails(NewRecipeDetailsRequest newRecipeDetailsRequest) {
        Recipe recipe = createAndSaveRecipe(newRecipeDetailsRequest);
        handleAddRecipeImage(newRecipeDetailsRequest.getImageData(), recipe);
    }

    public List<RecipeResponse> findRecipesBy(String searchParam) {
        List<Recipe> recipes = recipeRepository.findRecipesBy(searchParam);
        return recipeMapper.toRecipeResponses(recipes);
    }

    public List<RecipeResponse> findRecipesBy(Integer mealTypeId, Integer difficultyId, Integer cookingTimeId) {
        Integer difficultyLevelNumber = difficultyService.getDifficultyLevelNumber(difficultyId);
        Integer cookingTimeMinutesMax = cookingTimeService.getCookingTimeMinutesMax(cookingTimeId);

        List<Recipe> recipes = recipeRepository.findRecipesBy(mealTypeId, difficultyLevelNumber, cookingTimeMinutesMax);
        return recipeMapper.toRecipeResponses(recipes);
    }

    private Recipe createAndSaveRecipe(NewRecipeDetailsRequest newRecipeRequest) {
        Recipe recipe = createNewRecipe(newRecipeRequest);
        recipeRepository.save(recipe);
        return recipe;
    }

    private Recipe createNewRecipe(NewRecipeDetailsRequest newRecipeRequest) {
        return recipeMapper.toRecipe(newRecipeRequest);
    }

    private void handleAddRecipeImage(String imageData, Recipe recipe){
        if(hasImage(imageData)) {
            createAndSaveRecipeImage(imageData, recipe);
        }
    }

    private static boolean hasImage(String imageData) {
        return !imageData.isEmpty();
    }

    private void createAndSaveRecipeImage(String imageData, Recipe recipe) {
        RecipeImage recipeImage = createNewRecipeImage(imageData, recipe);
        recipeImageRepository.save(recipeImage);
    }

    private RecipeImage createNewRecipeImage(String imageData, Recipe recipe) {
        RecipeImage recipeImage = new RecipeImage();
        recipeImage.setImageData(BytesConverter.stringToBytes(imageData));
        recipeImage.setRecipe(recipe);
        return recipeImage;
    }
}
