package co.parquisoft.application.usecase.parkings.parkingspot;

import co.parquisoft.application.usecase.UseCaseWithoutInput;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;

import java.util.List;

public interface GetParkingSpot extends UseCaseWithoutInput<List<ParkingSpotDomain>> {
}
