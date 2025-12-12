package ee.team.sr8back.persistence.recipe;

import ee.team.sr8back.controller.recipe.dto.NewRecipeDetailsRequest;
import ee.team.sr8back.controller.recipe.dto.RecipeResponse;
import ee.team.sr8back.controller.recipe.dto.UserRecipeResponse;
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
    @Mapping(source = "instructions", target = "instructions")
    @Mapping(constant = "", target = "imageData")
    RecipeResponse toRecipeResponse(Recipe recipe);

    List<RecipeResponse> toRecipeResponses(List<Recipe> recipes);

    @Mapping(source = "recipeName", target = "name")
    @Mapping(source = "authorName", target = "author")
    @Mapping(source = "pax", target = "pax")
    @Mapping(source = "instructions", target = "instructions")
    @Mapping(source = "cookingTimeId", target = "cookingTime.id")
    @Mapping(source = "difficultyLevelNumber", target = "difficulty.levelNumber")
    @Mapping(source = "mealType", target = "mealType.name")
    Recipe toRecipe(NewRecipeDetailsRequest newRecipeDetailsRequest);

    @Mapping(source = "id", target = "recipeId")
    @Mapping(source = "name", target = "recipeName")
    @Mapping(constant = "", target = "recipeImage")
    UserRecipeResponse toUserRecipeResponse(Recipe recipe);

    List<UserRecipeResponse> toUserRecipeResponses(List<Recipe> recipes);

}