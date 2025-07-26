package co.parquisoft.domain.vehicle.rules.impl;

import co.parquisoft.application.secondaryports.repository.vehicle.VehicleRepository;
import co.parquisoft.domain.vehicle.exception.VehicleDoesNotExistsException;
import co.parquisoft.domain.vehicle.rules.VehicleDoesExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleDoesExistsRuleImpl implements VehicleDoesExistsRule {

    private final VehicleRepository vehicleRepository;

    public VehicleDoesExistsRuleImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!vehicleRepository.existsById(data)) {
            throw VehicleDoesNotExistsException.create();
        }
    }
}
