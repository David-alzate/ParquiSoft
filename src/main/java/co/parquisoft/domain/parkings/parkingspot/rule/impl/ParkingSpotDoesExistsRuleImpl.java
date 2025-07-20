package co.parquisoft.domain.parkings.parkingspot.rule.impl;

import co.parquisoft.application.secondaryports.repository.parkings.ParkingSpotRepository;
import co.parquisoft.domain.parkings.parkingspot.exception.ParkingSpotDoesNotExistsException;
import co.parquisoft.domain.parkings.parkingspot.rule.ParkingSpotDoesExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ParkingSpotDoesExistsRuleImpl implements ParkingSpotDoesExistsRule {

    private final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotDoesExistsRuleImpl(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!parkingSpotRepository.existsById(data)) {
            throw ParkingSpotDoesNotExistsException.create();
        }
    }
}
