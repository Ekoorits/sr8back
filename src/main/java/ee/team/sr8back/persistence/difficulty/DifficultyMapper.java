package ee.team.sr8back.persistence.difficulty;

import ee.team.sr8back.controller.difficulty.dto.DifficultyResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface DifficultyMapper {

    @Mapping(source = "id",target = "difficultyId")
    @Mapping(source = "levelName",target = "difficultyLevelName")

    DifficultyResponse toDifficultyResponse(Difficulty difficulty);
    List <DifficultyResponse> toDifficultyResponses(List<Difficulty> difficulties);

}