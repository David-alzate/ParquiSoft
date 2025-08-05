package co.parquisoft.domain.vehicle.rules.impl;

import co.parquisoft.application.secondaryports.repository.vehicle.VehicleRepository;
import co.parquisoft.domain.vehicle.exception.VehicleDoesExistsException;
import co.parquisoft.domain.vehicle.rules.VehicleDoesNotExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleDoesNotExistsRuleImpl implements VehicleDoesNotExistsRule {

    private final VehicleRepository vehicleRepository;

    public VehicleDoesNotExistsRuleImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void validate(UUID data) {
        if (vehicleRepository.existsById(data)) {
            throw VehicleDoesExistsException.create();
        }
    }
}
