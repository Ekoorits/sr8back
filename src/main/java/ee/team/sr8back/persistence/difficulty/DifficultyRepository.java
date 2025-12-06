package ee.team.sr8back.persistence.difficulty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DifficultyRepository extends JpaRepository<Difficulty, Integer> {
    @Query("select d from Difficulty d where d.levelNumber = :levelNumber")
    Optional<Difficulty> getDifficultyBy(Integer levelNumber);
}