package ee.team.sr8back.persistence.recipe;

import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecipeMapper {

    @Mapping(source = "id", target = "recipeId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "pax", target = "pax")
    @Mapping(source = "author", target = "author")
    RecipeResponse toRecipeResponse(Recipe recipe);

    List<RecipeResponse> toRecipes(List<Recipe> recipes);
}