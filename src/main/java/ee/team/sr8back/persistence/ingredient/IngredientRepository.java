package ee.team.sr8back.persistence.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    @Query("select i from Ingredient i where upper(i.name) = upper(:name)")
    Optional<Ingredient> findIngredientBy(String name);

    @Query("select i from Ingredient i where upper(i.name) like upper(concat('%', :name, '%')) order by i.name")
    List<Ingredient> findIngredientsBy(String name);

    @Query("select i from Ingredient i where i.status = :status")
    List<Ingredient> findIngredientsBys(String status);


}
