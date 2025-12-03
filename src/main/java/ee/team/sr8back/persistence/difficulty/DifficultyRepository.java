package ee.team.sr8back.persistence.difficulty;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DifficultyRepository extends JpaRepository<Difficulty, Integer> {
}