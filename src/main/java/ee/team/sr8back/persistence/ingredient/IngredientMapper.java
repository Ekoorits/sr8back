package ee.team.sr8back.persistence.ingredient;

import ee.team.sr8back.controller.ingredient.dto.IngredientResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IngredientMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "measureUnit.name", target = "measureUnitName")
    IngredientResponse toIngredientResponse(Ingredient ingredient);

    List<IngredientResponse> toIngredientResponses(List<Ingredient> ingredients);

}