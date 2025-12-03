package ee.team.sr8back.service;

import ee.team.sr8back.controller.mealtype.dto.MealTypeResponse;
import ee.team.sr8back.persistence.mealtype.MealTypeMapper;
import ee.team.sr8back.persistence.mealtype.MealTypeRepository;
import ee.team.sr8back.persistence.mealtype.MealType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MealTypeService {

    private final MealTypeRepository mealTypeRepository;
    private final MealTypeMapper mealTypeMapper;

    public List<MealTypeResponse> findAllMealTypes() {
        List<MealType> mealTypes = mealTypeRepository.findAll();
        return mealTypeMapper.toMealTypeResponses(mealTypes);

    }
}
