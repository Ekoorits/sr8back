package ee.team.sr8back.controller.recipeimage;

import ee.team.sr8back.controller.recipeimage.dto.RecipeImageResponse;
import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.infrastructure.util.BytesConverter;
import ee.team.sr8back.persistence.recipeimage.RecipeImage;
import ee.team.sr8back.persistence.recipeimage.RecipeImageRepository;
import ee.team.sr8back.service.RecipeImageService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor

public class RecipeImageController {
    private final RecipeImageRepository recipeImageRepository;
    private final RecipeImageService recipeImageService;

    @GetMapping("/recipes/image")
    @Operation(summary = "Tagastab retsepti pildi")
    public RecipeImageResponse getRecipeImageBy(@RequestParam Integer recipeId) {
        recipeImageService.getRecipeImageBy(recipeId);

    }
}
