package ee.team.sr8back.persistence.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    @Query("select r from Recipe r where lower(r.name) like lower(concat('%', :name, '%')) order by r.name")
    List<Recipe> findRecipesBy(String name);

    @Query("""
            select r from Recipe r
            where (r.mealType.id = :mealTypeId or :mealTypeId = 0) and r.difficulty.levelNumber <= :difficultyLevelNumber and r.cookingTime.minutesMax <= :cookingTimeMinutesMax
            order by r.name""")
    List<Recipe> findRecipesBy(Integer mealTypeId, Integer difficultyLevelNumber, Integer cookingTimeMinutesMax);

}