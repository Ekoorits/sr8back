package ee.team.sr8back.persistence;

import ee.team.sr8back.persistence.cookingtime.CookingTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CookingTimeRepository extends JpaRepository<CookingTime, Integer> {
}