package ee.team.sr8back.persistence.recipeimage;

import ee.team.sr8back.controller.recipeimage.dto.RecipeImageResponse;
import ee.team.sr8back.infrastructure.util.BytesConverter;
import ee.team.sr8back.persistence.recipe.RecipeMapper;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {RecipeMapper.class})
public interface RecipeImageMapper {

    @Mapping(source = "imageData", target = "imageData", qualifiedByName = "bytesToString")
    RecipeImageResponse toRecipeImageResponse(RecipeImage recipeImage);


    @Named("bytesToString")
    default String bytesToString(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        return BytesConverter.bytesToString(bytes);
    }

}