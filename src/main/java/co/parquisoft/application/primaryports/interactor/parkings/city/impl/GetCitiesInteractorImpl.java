package co.parquisoft.application.primaryports.interactor.parkings.city.impl;

import co.parquisoft.application.primaryports.dto.parkings.CityDTO;
import co.parquisoft.application.primaryports.interactor.parkings.city.GetCitiesInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.CityDTOMapper;
import co.parquisoft.application.usecase.parkings.city.GetCities;
import co.parquisoft.domain.parkings.city.CityDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetCitiesInteractorImpl implements GetCitiesInteractor {

    private final GetCities getCities;

    public GetCitiesInteractorImpl(GetCities getCities) {
        this.getCities = getCities;
    }

    @Override
    public List<CityDTO> execute() {
        List<CityDomain> results = getCities.execute();
        return CityDTOMapper.INSTANCE.toDtoCollection(results);
    }
}
