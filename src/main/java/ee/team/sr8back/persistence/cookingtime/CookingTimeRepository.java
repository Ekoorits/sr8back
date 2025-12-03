package ee.team.sr8back.persistence.cookingtime;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CookingTimeRepository extends JpaRepository<CookingTime, Integer> {
}