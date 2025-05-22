package co.parquisoft.domain.vehicle.rules.impl;

import co.parquisoft.application.secondaryports.repository.vehicle.VehicleRepository;
import co.parquisoft.domain.vehicle.exception.VehicleDoesExitsException;
import co.parquisoft.domain.vehicle.rules.VehicleDoesNotExitsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleDoesNotExitsRuleImpl implements VehicleDoesNotExitsRule {

    private final VehicleRepository vehicleRepository;

    public VehicleDoesNotExitsRuleImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void validate(UUID data) {
        if (vehicleRepository.existsById(data)) {
            throw VehicleDoesExitsException.create();
        }
    }
}
