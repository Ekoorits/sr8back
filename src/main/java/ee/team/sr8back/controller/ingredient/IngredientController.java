package ee.team.sr8back.controller.ingredient;

import ee.team.sr8back.controller.ingredient.dto.IngredientResponse;
import ee.team.sr8back.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class IngredientController {

    private final IngredientService ingredientService;

    @GetMapping("/ingredients")
    public List<IngredientResponse> findIngredientsBy(@RequestParam String searchParam) {
        return ingredientService.findIngredientsBy(searchParam);
    }
}
