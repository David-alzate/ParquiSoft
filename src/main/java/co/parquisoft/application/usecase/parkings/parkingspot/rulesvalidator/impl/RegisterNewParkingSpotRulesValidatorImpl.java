package co.parquisoft.application.usecase.parkings.parkingspot.rulesvalidator.impl;

import co.parquisoft.application.usecase.parkings.parkingspot.rulesvalidator.RegisterNewParkingSpotRulesValidator;
import co.parquisoft.domain.parkings.branch.rules.BranchDoesExistsRule;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingSpotRulesValidatorImpl implements RegisterNewParkingSpotRulesValidator {

    private final BranchDoesExistsRule branchDoesExistsRule;

    public RegisterNewParkingSpotRulesValidatorImpl(BranchDoesExistsRule branchDoesExistsRule) {
        this.branchDoesExistsRule = branchDoesExistsRule;
    }

    @Override
    public void validate(ParkingSpotDomain data) {
        branchDoesExistsRule.validate(data.getBranch().getId());
    }
}
