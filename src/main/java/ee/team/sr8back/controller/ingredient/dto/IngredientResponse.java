package ee.team.sr8back.controller.ingredient.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link ee.team.sr8back.persistence.ingredient.Ingredient}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientResponse implements Serializable {
    private Integer id;
    @NotNull
    @Size(max = 255)
    private String name;
    private String measureUnitName;
}