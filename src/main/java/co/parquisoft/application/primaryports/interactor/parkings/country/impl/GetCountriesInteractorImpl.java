package co.parquisoft.application.primaryports.interactor.parkings.country.impl;

import co.parquisoft.application.primaryports.dto.parkings.CountryDTO;
import co.parquisoft.application.primaryports.interactor.parkings.country.GetCountriesInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.CountryDTOMapper;
import co.parquisoft.application.usecase.parkings.country.GetCountries;
import co.parquisoft.domain.parkings.country.CountryDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetCountriesInteractorImpl implements GetCountriesInteractor {

    private final GetCountries getCountry;

    public GetCountriesInteractorImpl(GetCountries getCountry) {
        this.getCountry = getCountry;
    }

    @Override
    public List<CountryDTO> execute() {
        List<CountryDomain> results = getCountry.execute();
        return CountryDTOMapper.INSTANCE.toDtoCollection(results);
    }
}
