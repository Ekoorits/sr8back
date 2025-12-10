package ee.team.sr8back.persistence.recipeingredient;

import ee.team.sr8back.controller.recipeingredient.dto.RecipeIngredientResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecipeIngredientMapper {


    @Mapping(source = "id", target = "recipeIngredientId")
    @Mapping(source = "ingredient.name", target = "recipeIngredientName")
    @Mapping(source = "amount", target = "recipeIngredientAmount")
    @Mapping(source = "ingredient.measureUnit.name", target = "recipeIngredientMeasureUnit")
    @Mapping(source = "ingredient.description", target = "recipeIngredientDescription")
    RecipeIngredientResponse toRecipeIngredientResponse(RecipeIngredient recipeIngredient);

    List<RecipeIngredientResponse> toRecipeIngredientResponses(List<RecipeIngredient> recipeIngredients);

}