package ee.team.sr8back.service;

import ee.team.sr8back.controller.recipeimage.dto.RecipeImageResponse;
import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.infrastructure.util.BytesConverter;
import ee.team.sr8back.persistence.recipeimage.RecipeImage;
import ee.team.sr8back.persistence.recipeimage.RecipeImageMapper;
import ee.team.sr8back.persistence.recipeimage.RecipeImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecipeImageService {

    private final RecipeImageRepository recipeImageRepository;
    private final RecipeImageMapper recipeImageMapper;

    public String getRecipeImage(Integer recipeId) {
        Optional<RecipeImage> optionalRecipeImage = recipeImageRepository.findRecipeImageBy(recipeId);
        if (optionalRecipeImage.isPresent()) {
            RecipeImage recipeImage = optionalRecipeImage.get();
            return BytesConverter.bytesToString(recipeImage.getImageData());
        }else {
            return "";
        }

    }
}
