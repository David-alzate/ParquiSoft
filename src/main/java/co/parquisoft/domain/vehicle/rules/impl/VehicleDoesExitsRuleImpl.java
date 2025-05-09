package co.parquisoft.domain.vehicle.rules.impl;

import co.parquisoft.application.secondaryports.repository.vehicle.VehicleRepository;
import co.parquisoft.domain.vehicle.exception.VehicleDoesNotExitsException;
import co.parquisoft.domain.vehicle.rules.VehicleDoesExitsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleDoesExitsRuleImpl implements VehicleDoesExitsRule {

    private final VehicleRepository vehicleRepository;

    public VehicleDoesExitsRuleImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!vehicleRepository.existsById(data)) {
            throw VehicleDoesNotExitsException.create();
        }
    }
}
