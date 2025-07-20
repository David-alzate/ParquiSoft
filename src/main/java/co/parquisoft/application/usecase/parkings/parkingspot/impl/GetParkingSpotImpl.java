package co.parquisoft.application.usecase.parkings.parkingspot.impl;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingSpotEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.ParkingSpotEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.ParkingSpotRepository;
import co.parquisoft.application.usecase.parkings.parkingspot.GetParkingSpot;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetParkingSpotImpl implements GetParkingSpot {

    private final ParkingSpotRepository parkingSpotRepository;

    public GetParkingSpotImpl(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Override
    public List<ParkingSpotDomain> execute() {
        List<ParkingSpotEntity> results = parkingSpotRepository.findAll();
        return ParkingSpotEntityMapper.INSTANCE.toDomainCollection(results);
    }
}
