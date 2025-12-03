package ee.team.sr8back.controller.mealtype;

import ee.team.sr8back.controller.mealtype.dto.MealTypeResponse;
import ee.team.sr8back.service.MealTypeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class  MealTypeController {


    private final MealTypeService mealTypeService;

    @GetMapping("/mealtypes")
    @Operation(summary = "Tagastab toidukordade listi")

    public List<MealTypeResponse> findAllMealTypes() {
        return mealTypeService.findAllMealTypes();
    }

}
