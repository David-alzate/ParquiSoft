package co.parquisoft.application.primaryports.interactor.parkings.impl;

import co.parquisoft.application.primaryports.dto.parkings.CountryDTO;
import co.parquisoft.application.primaryports.interactor.parkings.GetCountryInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.CountryDTOMapper;
import co.parquisoft.application.usecase.parkings.country.GetCountry;
import co.parquisoft.domain.parkings.country.CountryDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetCountryInteractorImpl implements GetCountryInteractor {

    private final GetCountry getCountry;

    public GetCountryInteractorImpl(GetCountry getCountry) {
        this.getCountry = getCountry;
    }

    @Override
    public List<CountryDTO> execute() {
        List<CountryDomain> results = getCountry.execute();
        return CountryDTOMapper.INSTANCE.toDtoCollection(results);
    }
}
