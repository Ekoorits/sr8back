package ee.team.sr8back.persistence.recipe;

import ee.team.sr8back.controller.recipe.dto.RecipeResponce;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecipeMapper {

    @Mapping(source = "id",target = "recipeId")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "author",target = "author")
    @Mapping(source = "pax",target = "pax")


    RecipeResponce toRecipeResponse(Recipe recipe);

}