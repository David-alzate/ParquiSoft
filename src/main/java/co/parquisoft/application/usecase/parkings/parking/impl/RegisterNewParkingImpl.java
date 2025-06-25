package co.parquisoft.application.usecase.parkings.parking.impl;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.ParkingEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.ParkingRepository;
import co.parquisoft.application.usecase.parkings.parking.RegisterNewParking;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingImpl implements RegisterNewParking {

    private final ParkingRepository parkingRepository;

    public RegisterNewParkingImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public void execute(ParkingDomain domain) {
        ParkingEntity parkingEntity = ParkingEntityMapper.INSTANCE.toEntity(domain);
        parkingRepository.save(parkingEntity);
    }
}
