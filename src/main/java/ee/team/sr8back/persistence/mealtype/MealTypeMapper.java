package ee.team.sr8back.persistence.mealtype;

import ee.team.sr8back.controller.mealtype.dto.MealTypeResponse;
import org.mapstruct.*;

import java.awt.*;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MealTypeMapper {

    @Mapping(source = "id",target = "mealTypeId")
    @Mapping(source = "name",target = "mealTypeName")

    MealTypeResponse toMealTypeResponse(MealType mealType);

   List<MealTypeResponse> toMealTypeResponses(List<MealType> mealTypes);
}