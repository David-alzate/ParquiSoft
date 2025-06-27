package co.parquisoft.application.usecase.parkings.parking.impl;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.ParkingEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.ParkingRepository;
import co.parquisoft.application.usecase.parkings.parking.GetParkings;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetParkingsImpl implements GetParkings {

    private final ParkingRepository parkingRepository;

    public GetParkingsImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public List<ParkingDomain> execute() {
        List<ParkingEntity> results = parkingRepository.findAll();
        return ParkingEntityMapper.INSTANCE.toDomainCollection(results);
    }
}
