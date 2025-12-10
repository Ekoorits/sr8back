package ee.team.sr8back.service;

import ee.team.sr8back.controller.ingredient.dto.IngredientResponse;
import ee.team.sr8back.infrastructure.exception.DataNotFoundException;
import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.persistence.ingredient.Ingredient;
import ee.team.sr8back.persistence.ingredient.IngredientMapper;
import ee.team.sr8back.persistence.ingredient.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientService {

    private final IngredientRepository ingredientRepository;
    private final IngredientMapper ingredientMapper;

    public Ingredient getValidIngredient(Integer ingredientId) {
        return ingredientRepository.findById(ingredientId).orElseThrow(() -> new PrimaryKeyNotFoundException("ingredientId", ingredientId));
    }


    public Ingredient findIngredientBy(String ingredientName) {
        return ingredientRepository.findIngredientBy(ingredientName)
                .orElseThrow(() -> new DataNotFoundException("Ei leidnud selle nimega koostisosa", 777));
    }

    public List<IngredientResponse> findIngredientsBy(String searchParam) {
        List<Ingredient> ingredients = ingredientRepository.findIngredientsBy(searchParam);
        return ingredientMapper.toIngredientResponses(ingredients);
    }

    public List<IngredientResponse> findAllIngredients() {
        List<Ingredient> ingredients = ingredientRepository.findAll();
        return ingredientMapper.toIngredientResponses(ingredients);
    }
}
