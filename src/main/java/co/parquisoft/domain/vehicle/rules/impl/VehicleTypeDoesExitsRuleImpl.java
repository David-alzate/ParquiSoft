package co.parquisoft.domain.vehicle.rules.impl;

import co.parquisoft.application.secondaryports.repository.commons.VehicleTypeRepository;
import co.parquisoft.domain.vehicle.exception.VehicleTypeDoesNotExitsException;
import co.parquisoft.domain.vehicle.rules.VehicleTypeDoesExitsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleTypeDoesExitsRuleImpl implements VehicleTypeDoesExitsRule {

    private final VehicleTypeRepository vehicleTypeRepository;

    public VehicleTypeDoesExitsRuleImpl(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!vehicleTypeRepository.existsById(data)) {
            throw VehicleTypeDoesNotExitsException.create();
        }
    }
}
