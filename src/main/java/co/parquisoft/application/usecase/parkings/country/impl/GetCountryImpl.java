package co.parquisoft.application.usecase.parkings.country.impl;

import co.parquisoft.application.secondaryports.entity.parkings.CountryEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.CountryEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.CountryRepository;
import co.parquisoft.application.usecase.parkings.country.GetCountry;
import co.parquisoft.domain.parkings.country.CountryDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetCountryImpl implements GetCountry {

    private final CountryRepository countryRepository;

    public GetCountryImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<CountryDomain> execute() {
        List<CountryEntity> results = countryRepository.findAll();
        return CountryEntityMapper.INSTANCE.toDomainCollection(results);
    }
}
