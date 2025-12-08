package ee.team.sr8back.persistence.recipeingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Integer> {
    @Query("select r from RecipeIngredient r where r.recipe.id = :id order by r.ingredient.name")
    List<RecipeIngredient> findRecipeIngredientsBy(Integer id);
}