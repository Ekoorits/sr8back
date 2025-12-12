package ee.team.sr8back.persistence.cookingtime;

import ee.team.sr8back.controller.cookingtime.dto.CookingTimeResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CookingTimeMapper {

    @Mapping(source = "id", target = "cookingTimeId")
    @Mapping(source = "minutesMax", target = "cookingTimeMinutesMax")
    CookingTimeResponse toCookingTimeResponse(CookingTime cookingTime);

    List<CookingTimeResponse> toCookingTimeResponses(List<CookingTime> cookingTimes);
}