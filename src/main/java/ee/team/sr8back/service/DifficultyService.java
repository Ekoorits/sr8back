package ee.team.sr8back.service;

import ee.team.sr8back.controller.difficulty.dto.DifficultyResponse;
import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.persistence.difficulty.Difficulty;
import ee.team.sr8back.persistence.difficulty.DifficultyMapper;
import ee.team.sr8back.persistence.difficulty.DifficultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DifficultyService {

    private final DifficultyRepository difficultyRepository;
    private final DifficultyMapper difficultyMapper;

    public Integer getDifficultyLevelNumber(Integer difficultyId) {
        return getValidDifficultyBy(difficultyId).getLevelNumber();
    }

    public Difficulty getValidDifficultyBy(Integer difficultyId) {
        return difficultyRepository.findById(difficultyId)
                .orElseThrow(() -> new PrimaryKeyNotFoundException("difficultyId", difficultyId));
    }

    public List<DifficultyResponse> findAllDifficultyTypes() {
        List<Difficulty> difficulties = difficultyRepository.findAll();
        return difficultyMapper.toDifficultyResponses(difficulties);

    }
}
