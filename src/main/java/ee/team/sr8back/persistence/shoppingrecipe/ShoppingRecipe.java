package ee.team.sr8back.persistence.shoppingrecipe;

import ee.team.sr8back.persistence.recipe.Recipe;
import ee.team.sr8back.persistence.shopping.Shopping;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "shopping_recipe", schema = "smartrecipebook")
public class ShoppingRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "shopping_id", nullable = false)
    private Shopping shopping;

    @NotNull
    @Column(name = "pax", nullable = false)
    private Integer pax;

}