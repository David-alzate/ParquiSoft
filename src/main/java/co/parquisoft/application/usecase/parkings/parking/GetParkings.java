package co.parquisoft.application.usecase.parkings.parking;

import co.parquisoft.application.usecase.UseCaseWithoutInput;
import co.parquisoft.domain.parkings.parking.ParkingDomain;

import java.util.List;

public interface GetParkings extends UseCaseWithoutInput<List<ParkingDomain>> {
}
