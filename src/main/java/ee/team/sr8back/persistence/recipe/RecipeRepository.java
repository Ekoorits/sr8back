package ee.team.sr8back.persistence.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    @Query("select r from Recipe r where lower(r.name) like lower(concat('%', :name, '%')) order by r.name")
    List<Recipe> findRecipesBy(String name);

    @Query("""
            select r from Recipe r
            where (r.mealType.id = :mealtypeId or :mealTypeId) and r.cookingTime.minutesMax <= :minutesMax and r.difficulty.levelNumber <= :levelNumber
            order by r.name""")
    List<Recipe> findRecipesBy(Integer id, Integer minutesMax, Integer levelNumber);

}