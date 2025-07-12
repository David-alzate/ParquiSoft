package co.parquisoft.application.usecase.parkings.parkingspot.impl;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingSpotEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.ParkingSpotEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.ParkingSpotRepository;
import co.parquisoft.application.usecase.parkings.parkingspot.RegisterNewParkingSpot;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingSpotImpl implements RegisterNewParkingSpot {

    private final ParkingSpotRepository parkingSpotRepository;

    public RegisterNewParkingSpotImpl(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Override
    public void execute(ParkingSpotDomain domain) {
        ParkingSpotEntity parkingSpotEntity = ParkingSpotEntityMapper.INSTANCE.toEntity(domain);
        parkingSpotRepository.save(parkingSpotEntity);
    }
}
