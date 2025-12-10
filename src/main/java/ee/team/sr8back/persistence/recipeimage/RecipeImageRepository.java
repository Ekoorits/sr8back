package ee.team.sr8back.persistence.recipeimage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RecipeImageRepository extends JpaRepository<RecipeImage, Integer> {

    @Query("select r from RecipeImage r where r.recipe.id = :recipeId")
    Optional<RecipeImage> findRecipeImageBy(Integer recipeId);

}