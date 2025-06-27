package co.parquisoft.application.usecase.parkings.parking.impl;

import co.parquisoft.application.secondaryports.repository.parkings.ParkingRepository;
import co.parquisoft.application.usecase.parkings.parking.DeleteParking;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteParkingImpl implements DeleteParking {

    private final ParkingRepository parkingRepository;

    public DeleteParkingImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public void execute(UUID domain) {
        parkingRepository.deleteById(domain);
    }
}
