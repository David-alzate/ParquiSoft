package co.parquisoft.application.primaryports.interactor.parkings.parking.impl;

import co.parquisoft.application.primaryports.dto.parkings.ParkingDTO;
import co.parquisoft.application.primaryports.interactor.parkings.parking.RegisterNewParkingInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.ParkingDTOMapper;
import co.parquisoft.application.usecase.parkings.parking.RegisterNewParking;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RegisterNewParkingInteractorImpl implements RegisterNewParkingInteractor {

    private final RegisterNewParking registerNewParking;

    public RegisterNewParkingInteractorImpl(RegisterNewParking registerNewParking) {
        this.registerNewParking = registerNewParking;
    }

    @Override
    public void execute(ParkingDTO data) {
        ParkingDomain parkingDomain = ParkingDTOMapper.INSTANCE.toDomain(data);
        registerNewParking.execute(parkingDomain);
    }
}
