package ee.team.sr8back.service;

import ee.team.sr8back.controller.recipeingredient.dto.RecipeIngredientResponse;
import ee.team.sr8back.persistence.ingredient.Ingredient;
import ee.team.sr8back.persistence.recipe.Recipe;
import ee.team.sr8back.persistence.recipeingredient.RecipeIngredient;
import ee.team.sr8back.persistence.recipeingredient.RecipeIngredientMapper;
import ee.team.sr8back.persistence.recipeingredient.RecipeIngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeIngredientService {

    private final RecipeIngredientRepository recipeIngredientRepository;
    private final RecipeIngredientMapper recipeIngredientMapper;
    private final IngredientService ingredientService;
    private final RecipeService recipeService;

    public List<RecipeIngredientResponse> findAllRecipeIngredients(Integer recipeId) {
        List<RecipeIngredient> recipeIngredients = recipeIngredientRepository.findRecipeIngredientsBy(recipeId);
        return recipeIngredientMapper.toRecipeIngredientResponses(recipeIngredients);
    }

    public void deleteRecipeIngredient(Integer recipeIngredientId) {
        recipeIngredientRepository.deleteById(recipeIngredientId);
    }

    public void addRecipeIngredient(Integer recipeId, Integer ingredientId, BigDecimal ingredientAmount) {
        creatAndSaveRecipeIngredient(recipeId, ingredientId, ingredientAmount);
    }

    private void creatAndSaveRecipeIngredient(Integer recipeId, Integer ingredientId, BigDecimal ingredientAmount) {
        RecipeIngredient recipeIngredient = createRecipeIngredient(recipeId, ingredientId, ingredientAmount);
        recipeIngredientRepository.save(recipeIngredient);
    }

    private RecipeIngredient createRecipeIngredient(Integer recipeId, Integer ingredientId, BigDecimal ingredientAmount) {
        Recipe recipe = recipeService.getValidRecipe(recipeId);
        Ingredient ingredient = ingredientService.getValidIngredient(ingredientId);
        RecipeIngredient recipeIngredient = new RecipeIngredient();
        recipeIngredient.setRecipe(recipe);
        recipeIngredient.setIngredient(ingredient);
        recipeIngredient.setAmount(ingredientAmount);
        return recipeIngredient;
    }

}
