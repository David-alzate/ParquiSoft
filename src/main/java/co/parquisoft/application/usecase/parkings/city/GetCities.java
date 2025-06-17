package co.parquisoft.application.usecase.parkings.city;

import co.parquisoft.application.usecase.UseCaseWithoutInput;
import co.parquisoft.domain.parkings.city.CityDomain;

import java.util.List;

public interface GetCities extends UseCaseWithoutInput<List<CityDomain>> {
}
