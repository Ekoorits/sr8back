package ee.team.sr8back.service;

import ee.team.sr8back.controller.cookingtime.dto.CookingTimeResponse;
import ee.team.sr8back.infrastructure.exception.DataNotFoundException;
import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.persistence.cookingtime.CookingTime;
import ee.team.sr8back.persistence.cookingtime.CookingTimeMapper;
import ee.team.sr8back.persistence.cookingtime.CookingTimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CookingTimeService {

    private final CookingTimeRepository cookingTimeRepository;
    private final CookingTimeMapper cookingTimeMapper;

    public Integer getCookingTimeMinutesMax(Integer cookingTimeId) {
        return getValidCookingTimeBy(cookingTimeId).getMinutesMax();
    }

    public CookingTime getValidCookingTimeBy(Integer cookingTimeId) {
        return cookingTimeRepository.findById(cookingTimeId)
                .orElseThrow(() -> new PrimaryKeyNotFoundException("cookingTimeId", cookingTimeId));
    }

    public List<CookingTimeResponse> findAllCookingTimes() {
        List<CookingTime> cookingTimes = cookingTimeRepository.findAll();
        return cookingTimeMapper.toCookingTimeResponses(cookingTimes);
    }

    public CookingTime getCookingTime(Integer cookingTimeMinutesMax) {
        return cookingTimeRepository.getCookingTimeBy(cookingTimeMinutesMax)
                .orElseThrow(() -> new DataNotFoundException("Andmeviga", 444));
    }
}
