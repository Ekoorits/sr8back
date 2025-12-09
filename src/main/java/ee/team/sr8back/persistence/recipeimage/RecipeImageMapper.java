package ee.team.sr8back.persistence.recipeimage;

import ee.team.sr8back.controller.recipeimage.dto.RecipeImageResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecipeImageMapper {
    RecipeImage toEntity(RecipeImageResponse recipeImageResponse);

    RecipeImageResponse toDto(RecipeImage recipeImage);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RecipeImage partialUpdate(RecipeImageResponse recipeImageResponse, @MappingTarget RecipeImage recipeImage);
}