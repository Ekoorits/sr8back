package ee.team.sr8back.persistence.recipeingredient;

import ee.team.sr8back.persistence.ingridient.Ingredient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "recipe_ingredient", schema = "smartrecipebook")
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "recipe_id", nullable = false)
    private Integer recipeId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @NotNull
    @Column(name = "amount", nullable = false, precision = 8, scale = 3)
    private BigDecimal amount;

}