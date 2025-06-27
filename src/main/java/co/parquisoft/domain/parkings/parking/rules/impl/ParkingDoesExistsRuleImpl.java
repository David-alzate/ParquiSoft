package co.parquisoft.domain.parkings.parking.rules.impl;

import co.parquisoft.application.secondaryports.repository.parkings.ParkingRepository;
import co.parquisoft.domain.parkings.parking.exception.ParkingDoesNotExistsException;
import co.parquisoft.domain.parkings.parking.rules.ParkingDoesExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ParkingDoesExistsRuleImpl implements ParkingDoesExistsRule {

    private final ParkingRepository parkingRepository;

    public ParkingDoesExistsRuleImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!parkingRepository.existsById(data)) {
            throw ParkingDoesNotExistsException.create();
        }
    }
}
