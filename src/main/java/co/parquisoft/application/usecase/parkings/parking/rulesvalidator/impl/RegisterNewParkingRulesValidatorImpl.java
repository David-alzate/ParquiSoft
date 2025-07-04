package co.parquisoft.application.usecase.parkings.parking.rulesvalidator.impl;

import co.parquisoft.application.usecase.parkings.parking.rulesvalidator.RegisterNewParkingRulesValidator;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import co.parquisoft.domain.parkings.parking.rules.ParkingDoesNotExistsRule;
import co.parquisoft.domain.parkings.parking.rules.impl.ParkingNameLengthIsValidRuleImpl;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingRulesValidatorImpl implements RegisterNewParkingRulesValidator {

    private final ParkingDoesNotExistsRule parkingDoesNotExistsRule;
    private final ParkingNameLengthIsValidRuleImpl parkingNameLengthIsValidRule;

    public RegisterNewParkingRulesValidatorImpl(ParkingDoesNotExistsRule parkingDoesNotExistsRule, ParkingNameLengthIsValidRuleImpl parkingNameLengthIsValidRule) {
        this.parkingDoesNotExistsRule = parkingDoesNotExistsRule;
        this.parkingNameLengthIsValidRule = parkingNameLengthIsValidRule;
    }

    @Override
    public void validate(ParkingDomain data) {
        parkingDoesNotExistsRule.validate(data.getId());
        parkingNameLengthIsValidRule.validate(data.getName());
    }
}
