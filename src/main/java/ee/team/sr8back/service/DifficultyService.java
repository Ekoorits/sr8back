package ee.team.sr8back.service;

import ee.team.sr8back.persistence.difficulty.Difficulty;
import ee.team.sr8back.persistence.difficulty.DifficultyRepository;
import org.springframework.stereotype.Service;

@Service

public class DifficultyService {
    private final DifficultyRepository difficultyRepository;

    public DifficultyService(DifficultyRepository difficultyRepository) {
        this.difficultyRepository = difficultyRepository;
    }

    public Difficulty getValidDifficulty(Integer difficultyId) {
        return difficultyRepository.findById(difficultyId)
                .orElseThrow(()-> new PrimaryKeyNotFoundException())
    }
}
