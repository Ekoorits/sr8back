package ee.team.sr8back.persistence.cookingtime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CookingTimeRepository extends JpaRepository<CookingTime, Integer> {

    @Query("select c from CookingTime c where c.minutesMax = :minutesMax")
    Optional<CookingTime> getCookingTimeBy(Integer minutesMax);
}