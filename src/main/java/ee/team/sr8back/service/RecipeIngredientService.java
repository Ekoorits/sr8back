package ee.team.sr8back.service;

import ee.team.sr8back.controller.recipeingredient.dto.RecipeIngredientResponse;
import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.persistence.recipeingredient.RecipeIngredient;
import ee.team.sr8back.persistence.recipeingredient.RecipeIngredientMapper;
import ee.team.sr8back.persistence.recipeingredient.RecipeIngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeIngredientService {

    private final RecipeIngredientRepository recipeIngredientRepository;
    private final RecipeIngredientMapper recipeIngredientMapper;

    public List<RecipeIngredientResponse> findAllRecipeIngredients(Integer recipeId) {
        List<RecipeIngredient> recipeIngredients = recipeIngredientRepository.findRecipeIngredientsBy(recipeId);
        return recipeIngredientMapper.toRecipeIngredientResponses(recipeIngredients);
    }

    public void deleteRecipeIngredient(Integer recipeIngredientId) {
        recipeIngredientRepository.delete(ingredient(recipeIngredientId));
    }

    private RecipeIngredient ingredient(Integer recipeIngredientId) {
        return recipeIngredientRepository.findById(recipeIngredientId)
                .orElseThrow(() -> new PrimaryKeyNotFoundException("recipeIngredientId", recipeIngredientId));
    }

}
