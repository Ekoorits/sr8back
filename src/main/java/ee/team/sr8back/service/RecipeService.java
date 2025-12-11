package ee.team.sr8back.service;

import ee.team.sr8back.controller.recipe.dto.NewRecipeDetailsRequest;
import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import ee.team.sr8back.controller.recipe.dto.UserRecipeResponse;
import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.infrastructure.util.BytesConverter;
import ee.team.sr8back.persistence.cookingtime.CookingTime;
import ee.team.sr8back.persistence.difficulty.Difficulty;
import ee.team.sr8back.persistence.mealtype.MealType;
import ee.team.sr8back.persistence.recipe.Recipe;
import ee.team.sr8back.persistence.recipe.RecipeMapper;
import ee.team.sr8back.persistence.recipe.RecipeRepository;
import ee.team.sr8back.persistence.recipeimage.RecipeImage;
import ee.team.sr8back.persistence.recipeimage.RecipeImageRepository;
import ee.team.sr8back.persistence.user.User;
import ee.team.sr8back.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;
    private final DifficultyService difficultyService;
    private final CookingTimeService cookingTimeService;
    private final RecipeImageRepository recipeImageRepository;
    private final MealTypeService mealTypeService;
    private final UserRepository userRepository;
    private final RecipeImageService recipeImageService;


    public Recipe getValidRecipe(Integer recipeId) {
        return recipeRepository.findById(recipeId)
                .orElseThrow(() -> new PrimaryKeyNotFoundException("recipeId", recipeId));
    }

    @Transactional
    public RecipeResponse findRecipe(Integer recipeId) {
        Recipe recipe = getValidRecipe(recipeId);
        RecipeResponse recipeResponse = recipeMapper.toRecipeResponse(recipe);
        String recipeImageDataAsString = recipeImageService.getRecipeImage(recipeId);
        recipeResponse.setImageData(recipeImageDataAsString);
        return recipeResponse;
    }

    @Transactional
    public Integer addNewRecipeDetails(NewRecipeDetailsRequest newRecipeDetailsRequest) {
        Recipe recipe = createAndSaveRecipe(newRecipeDetailsRequest);
        handleAddRecipeImage(newRecipeDetailsRequest.getImageData(), recipe);
        return recipe.getId();
    }


    public List<RecipeResponse> findRecipesBy(String searchParam) {
        List<Recipe> recipes = recipeRepository.findRecipesBy(searchParam);
        List<RecipeResponse> recipeResponses = recipeMapper.toRecipeResponses(recipes);
        handleAddImageData(recipeResponses);
        return recipeResponses;
    }

    private void handleAddImageData(List<RecipeResponse> recipeResponses) {
        for (RecipeResponse recipeResponse : recipeResponses) {
            String recipeImageData = recipeImageService.getRecipeImage(recipeResponse.getRecipeId());
            recipeResponse.setImageData(recipeImageData);
        }
    }

    public List<RecipeResponse> findRecipesBy(Integer mealTypeId, Integer difficultyId, Integer cookingTimeId) {
        Integer difficultyLevelNumber = difficultyService.getDifficultyLevelNumber(difficultyId);
        Integer cookingTimeMinutesMax = cookingTimeService.getCookingTimeMinutesMax(cookingTimeId);

        List<Recipe> recipes = recipeRepository.findRecipesBy(mealTypeId, difficultyLevelNumber, cookingTimeMinutesMax);
        return recipeMapper.toRecipeResponses(recipes);
    }

    public List<UserRecipeResponse> findRecipesBy(Integer userId) {
        List<Recipe> recipes = recipeRepository.findRecipesBy(userId);
        List<UserRecipeResponse> userRecipeResponses = recipeMapper.toUserRecipeResponses(recipes);

        for (UserRecipeResponse recipeResponse : userRecipeResponses) {
            Integer recipeId = recipeResponse.getRecipeId();
            Optional<RecipeImage> optionalRecipeImage = recipeImageRepository.findRecipeImageBy(recipeId);
            if (optionalRecipeImage.isPresent()) {
                byte[] imageDataAsBytes = optionalRecipeImage.get().getImageData();
                String imageDataAsString = BytesConverter.bytesToString(imageDataAsBytes);
                recipeResponse.setRecipeImage(imageDataAsString);
            }
        }

        return userRecipeResponses;
    }

    private Recipe createAndSaveRecipe(NewRecipeDetailsRequest newRecipeRequest) {
        Recipe recipe = createNewRecipe(newRecipeRequest);
        recipeRepository.save(recipe);
        return recipe;
    }

    private Recipe createNewRecipe(NewRecipeDetailsRequest newRecipeRequest) {

        Recipe recipe = recipeMapper.toRecipe(newRecipeRequest);
        getCookingTimeMinutesAndSetToRecipe(newRecipeRequest, recipe);
        getMealTypeAndSetToRecipe(newRecipeRequest, recipe);
        getDifficultyLevelAndSetToRecipe(newRecipeRequest, recipe);
        getCurrentUserAndSetAsAddingUser(recipe);
        return recipe;
    }

    private void getCookingTimeMinutesAndSetToRecipe(NewRecipeDetailsRequest newRecipeRequest, Recipe recipe) {
        CookingTime cookingTime = cookingTimeService.getCookingTime(newRecipeRequest.getCookingTimeMinutesMax());
        recipe.setCookingTime(cookingTime);
    }

    private void getMealTypeAndSetToRecipe(NewRecipeDetailsRequest newRecipeRequest, Recipe recipe) {
        MealType mealType = mealTypeService.getMealType(newRecipeRequest.getMealType());
        recipe.setMealType(mealType);
    }

    private void getDifficultyLevelAndSetToRecipe(NewRecipeDetailsRequest newRecipeRequest, Recipe recipe) {
        Difficulty difficulty = difficultyService.getDifficultyBy(newRecipeRequest.getDifficultyLevelNumber());
        recipe.setDifficulty(difficulty);
    }

    private void getCurrentUserAndSetAsAddingUser(Recipe recipe) {
        User user = getCurrentUser();
        recipe.setUser(user);
    }

    private User getCurrentUser() {
        // TODO: Find active user from FE session storage
        return userRepository.findById(1)
                .orElseThrow(() -> new PrimaryKeyNotFoundException("id", 1));
    }


    private void handleAddRecipeImage(String imageData, Recipe recipe) {
        if (hasImage(imageData)) {
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
