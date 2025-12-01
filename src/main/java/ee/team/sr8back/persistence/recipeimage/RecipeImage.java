package ee.team.sr8back.persistence.recipeimage;

import ee.team.sr8back.persistence.recipe.Recipe;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "recipe_image", schema = "smartrecipebook")
public class RecipeImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @NotNull
    @Column(name = "image_data", nullable = false)
    private byte[] imageData;

}