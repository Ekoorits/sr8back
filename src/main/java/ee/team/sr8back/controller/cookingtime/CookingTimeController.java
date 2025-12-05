package ee.team.sr8back.controller.cookingtime;

import ee.team.sr8back.controller.cookingtime.dto.CookingTimeResponse;
import ee.team.sr8back.service.CookingTimeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CookingTimeController {

    private final CookingTimeService cookingTimeService;

    @GetMapping("/cookingtime")
    @Operation(summary = "Tagastab valmistusaegade listi")
    public List<CookingTimeResponse> findAllCookingTimes() {
        return cookingTimeService.findAllCookingTimes();
    }
}
