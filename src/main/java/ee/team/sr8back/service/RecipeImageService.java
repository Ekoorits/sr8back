package ee.team.sr8back.service;

import ee.team.sr8back.infrastructure.exception.DataNotFoundException;
import ee.team.sr8back.persistence.recipeimage.RecipeImage;
import ee.team.sr8back.persistence.recipeimage.RecipeImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeImageService {

    private final RecipeImageRepository recipeImageRepository;

    public void getRecipeImageBy(Integer recipeId) {
        RecipeImage recipeImage = recipeImageRepository.findByRecipeId(recipeId).orElseThrow(() -> new DataNotFoundException("Pilt pole leitud",333));
    }
}
