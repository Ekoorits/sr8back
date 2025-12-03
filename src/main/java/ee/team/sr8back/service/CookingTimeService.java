package ee.team.sr8back.service;

import ee.team.sr8back.infrastructure.exception.PrimaryKeyNotFoundException;
import ee.team.sr8back.persistence.CookingTimeRepository;
import ee.team.sr8back.persistence.cookingtime.CookingTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CookingTimeService {


    private final CookingTimeRepository cookingTimeRepository;

    public Integer getCookingTimeMinutesMax(Integer cookingTimeid) {
        return getValidCookingTimeBy(cookingTimeid).getMinutesMax();
    }

    public CookingTime getValidCookingTimeBy(Integer cookingTimeId) {
       return cookingTimeRepository.findById(cookingTimeId)
              .orElseThrow( ()-> new PrimaryKeyNotFoundException("cookingTimeId",cookingTimeId));
    }
}
