package ee.team.sr8back.controller.recipeimage;

import ee.team.sr8back.controller.recipeimage.dto.RecipeImageResponse;
import ee.team.sr8back.service.RecipeImageService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class RecipeImageController {
    private final RecipeImageService recipeImageService;

    @GetMapping("/recipe/image")
    @Operation(summary = "Tagastab retsepti pildi")
    public String getRecipeImage(@RequestParam Integer recipeId) {
        return recipeImageService.getRecipeImage(recipeId);
    }

}
