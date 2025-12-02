package ee.team.sr8back.persistence.shoppinglist;

import ee.team.sr8back.persistence.ingredient.Ingredient;
import ee.team.sr8back.persistence.shopping.Shopping;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "shopping_list", schema = "smartrecipebook")
public class ShoppingList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "shopping_id", nullable = false)
    private Shopping shopping;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Size(max = 1)
    @NotNull
    @Column(name = "added_by", nullable = false, length = 1)
    private String addedBy;

}