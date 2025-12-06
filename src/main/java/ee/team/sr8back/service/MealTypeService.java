package ee.team.sr8back.service;

import ee.team.sr8back.controller.mealtype.dto.MealTypeResponse;
import ee.team.sr8back.infrastructure.exception.DataNotFoundException;
import ee.team.sr8back.persistence.mealtype.MealType;
import ee.team.sr8back.persistence.mealtype.MealTypeMapper;
import ee.team.sr8back.persistence.mealtype.MealTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class MealTypeService {

    private final MealTypeRepository mealTypeRepository;
    private final MealTypeMapper mealTypeMapper;

    public List<MealTypeResponse> findAllMealTypes() {
        List<MealType> mealTypes = mealTypeRepository.findAll();
        return mealTypeMapper.toMealTypeResponses(mealTypes);
    }

    public MealType getMealType(String mealType) {
        return mealTypeRepository.getMealTypeBy(mealType)
                .orElseThrow(() -> new DataNotFoundException("Andmeviga", 444));
    }
}