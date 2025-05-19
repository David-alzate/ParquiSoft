package co.parquisoft.application.usecase.parkings.country;

import co.parquisoft.application.usecase.UseCaseWithoutInput;
import co.parquisoft.domain.parkings.country.CountryDomain;

import java.util.List;

public interface GetCountry extends UseCaseWithoutInput<List<CountryDomain>> {
}
