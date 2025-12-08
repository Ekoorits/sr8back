package ee.team.sr8back.persistence.difficulty;

import ee.team.sr8back.controller.difficulty.dto.DifficultyResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface DifficultyMapper {

    @Mapping(source = "levelName", target = "difficultyLevelName")
    @Mapping(source = "levelNumber", target = "difficultyLevelNumber")
    DifficultyResponse toDifficultyResponse(Difficulty difficulty);

    List<DifficultyResponse> toDifficultyResponses(List<Difficulty> difficulties);
}