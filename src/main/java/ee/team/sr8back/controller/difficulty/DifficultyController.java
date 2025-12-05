package ee.team.sr8back.controller.difficulty;

import ee.team.sr8back.controller.difficulty.dto.DifficultyResponse;
import ee.team.sr8back.service.DifficultyService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DifficultyController {

    private final DifficultyService difficultyService;

    @GetMapping("/difficulties")
    @Operation(summary = "Tagastab kõik raskusastmed listina")
    public List<DifficultyResponse> findAllDifficultyTypes() {
        return difficultyService.findAllDifficultyTypes();
    }
}
