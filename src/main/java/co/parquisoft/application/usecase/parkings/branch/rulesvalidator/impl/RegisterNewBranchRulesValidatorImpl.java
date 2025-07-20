package co.parquisoft.application.usecase.parkings.branch.rulesvalidator.impl;

import co.parquisoft.application.usecase.parkings.branch.rulesvalidator.RegisterNewBranchRulesValidator;
import co.parquisoft.domain.parkings.branch.BranchDomain;
import co.parquisoft.domain.parkings.branch.rules.BranchDoesNotExistsRule;
import co.parquisoft.domain.parkings.branch.rules.BranchTypeDoesExistsRule;
import co.parquisoft.domain.parkings.parking.rules.ParkingDoesExistsRule;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewBranchRulesValidatorImpl implements RegisterNewBranchRulesValidator {

    private final BranchDoesNotExistsRule branchDoesNotExistsRule;
    private final ParkingDoesExistsRule parkingDoesExistsRule;
    private final BranchTypeDoesExistsRule branchTypeDoesExistsRule;

    public RegisterNewBranchRulesValidatorImpl(BranchDoesNotExistsRule branchDoesNotExistsRule, ParkingDoesExistsRule parkingDoesExistsRule, BranchTypeDoesExistsRule branchTypeDoesExistsRule) {
        this.branchDoesNotExistsRule = branchDoesNotExistsRule;
        this.parkingDoesExistsRule = parkingDoesExistsRule;
        this.branchTypeDoesExistsRule = branchTypeDoesExistsRule;
    }

    @Override
    public void validate(BranchDomain data) {
        branchDoesNotExistsRule.validate(data.getId());
        parkingDoesExistsRule.validate(data.getParking().getId());
        branchTypeDoesExistsRule.validate(data.getBranchType().getId());
    }
}
