package co.parquisoft.application.primaryports.interactor.parkings.parkingspot.impl;

import co.parquisoft.application.primaryports.dto.parkings.ParkingSpotDTO;
import co.parquisoft.application.primaryports.interactor.parkings.parkingspot.RegisterNewParkingSpotInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.ParkingSpotDTOMapper;
import co.parquisoft.application.usecase.parkings.parkingspot.RegisterNewParkingSpot;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class RegisterNewParkingSpotInteractorImpl implements RegisterNewParkingSpotInteractor {

    private final RegisterNewParkingSpot registerNewParkingSpot;

    public RegisterNewParkingSpotInteractorImpl(RegisterNewParkingSpot registerNewParkingSpot) {
        this.registerNewParkingSpot = registerNewParkingSpot;
    }

    @Override
    public void execute(ParkingSpotDTO data) {
        ParkingSpotDomain parkingSpotDomain = ParkingSpotDTOMapper.INSTANCE.toDomain(data);
        registerNewParkingSpot.execute(parkingSpotDomain);
    }
}
