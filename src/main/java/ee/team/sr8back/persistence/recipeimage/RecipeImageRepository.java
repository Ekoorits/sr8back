package ee.team.sr8back.persistence.recipeimage;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RecipeImageRepository extends JpaRepository<RecipeImage, Integer> {

    Optional<RecipeImage> findByRecipeId( Integer recipeId);
}