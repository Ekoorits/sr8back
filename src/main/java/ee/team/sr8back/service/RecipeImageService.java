package ee.team.sr8back.service;

import ee.team.sr8back.controller.recipeimage.dto.RecipeImageResponse;
import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.persistence.recipeimage.RecipeImage;
import ee.team.sr8back.persistence.recipeimage.RecipeImageMapper;
import ee.team.sr8back.persistence.recipeimage.RecipeImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeImageService {

    private final RecipeImageRepository recipeImageRepository;
    private final RecipeImageMapper recipeImageMapper;

    public RecipeImageResponse getRecipeImage(Integer recipeId) {
        RecipeImage recipeImage = recipeImageRepository.findByRecipeId(recipeId)
                .orElseThrow(()-> new PrimaryKeyNotFoundException("recipeId", recipeId));
        return recipeImageMapper.toRecipeImageResponse(recipeImage);
    }
}
