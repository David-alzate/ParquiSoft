package co.parquisoft.domain.parkings.parking.rules.impl;

import co.parquisoft.application.secondaryports.repository.parkings.ParkingRepository;
import co.parquisoft.domain.parkings.parking.exception.ParkingDoesExistsException;
import co.parquisoft.domain.parkings.parking.rules.ParkingDoesNotExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ParkingDoesNotExistsRuleImpl implements ParkingDoesNotExistsRule {

    private final ParkingRepository parkingRepository;

    public ParkingDoesNotExistsRuleImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public void validate(UUID data) {
        if (parkingRepository.existsById(data)) {
            throw ParkingDoesExistsException.create();
        }
    }
}
