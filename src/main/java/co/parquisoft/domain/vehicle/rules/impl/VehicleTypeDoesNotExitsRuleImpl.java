package co.parquisoft.domain.vehicle.rules.impl;

import co.parquisoft.application.secondaryports.repository.commons.VehicleTypeRepository;
import co.parquisoft.domain.vehicle.exception.VehicleTypeDoesExitsException;
import co.parquisoft.domain.vehicle.rules.VehicleTypeDoesNotExitsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleTypeDoesNotExitsRuleImpl implements VehicleTypeDoesNotExitsRule {

    private final VehicleTypeRepository vehicleTypeRepository;

    public VehicleTypeDoesNotExitsRuleImpl(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Override
    public void validate(UUID data) {
        if (vehicleTypeRepository.existsById(data)) {
            throw VehicleTypeDoesExitsException.create();
        }
    }
}
