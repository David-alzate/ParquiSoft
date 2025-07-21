package co.parquisoft.application.usecase.parkings.parkingspot.rulesvalidator.impl;

import co.parquisoft.application.usecase.parkings.parkingspot.rulesvalidator.RegisterNewParkingSpotRulesValidator;
import co.parquisoft.domain.parkings.branch.rules.BranchDoesExistsRule;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import co.parquisoft.domain.vehicle.rules.VehicleTypeDoesExitsRule;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingSpotRulesValidatorImpl implements RegisterNewParkingSpotRulesValidator {

    private final BranchDoesExistsRule branchDoesExistsRule;
    private final VehicleTypeDoesExitsRule vehicleTypeDoesExitsRule;

    public RegisterNewParkingSpotRulesValidatorImpl(BranchDoesExistsRule branchDoesExistsRule, VehicleTypeDoesExitsRule vehicleTypeDoesExitsRule) {
        this.branchDoesExistsRule = branchDoesExistsRule;
        this.vehicleTypeDoesExitsRule = vehicleTypeDoesExitsRule;
    }

    @Override
    public void validate(ParkingSpotDomain data) {
        branchDoesExistsRule.validate(data.getBranch().getId());
        vehicleTypeDoesExitsRule.validate(data.getVehicleType().getId());
    }
}
