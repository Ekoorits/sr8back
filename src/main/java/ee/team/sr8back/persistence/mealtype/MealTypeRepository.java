package ee.team.sr8back.persistence.mealtype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MealTypeRepository extends JpaRepository<MealType, Integer> {
    @Query("select m from MealType m where m.name = :name")
    Optional<MealType> getMealTypeBy(String name);
}