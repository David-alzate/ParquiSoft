package co.parquisoft.application.usecase.parkings.city.impl;

import co.parquisoft.application.secondaryports.entity.parkings.CityEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.CityEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.CityRepository;
import co.parquisoft.application.usecase.parkings.city.GetCities;
import co.parquisoft.domain.parkings.city.CityDomain;

import java.util.List;

public class GetCitiesImpl implements GetCities {

    private final CityRepository cityRepository;

    public GetCitiesImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<CityDomain> execute() {
        List<CityEntity> results = cityRepository.findAll();
        return CityEntityMapper.INSTANCE.toDomainCollection(results);
    }
}
