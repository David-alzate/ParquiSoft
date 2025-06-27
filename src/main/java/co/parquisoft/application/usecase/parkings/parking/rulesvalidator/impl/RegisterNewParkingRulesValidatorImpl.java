package co.parquisoft.application.usecase.parkings.parking.rulesvalidator.impl;

import co.parquisoft.application.usecase.parkings.parking.rulesvalidator.RegisterNewParkingRulesValidator;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import co.parquisoft.domain.parkings.parking.rules.ParkingDoesNotExistsRule;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingRulesValidatorImpl implements RegisterNewParkingRulesValidator {

    private final ParkingDoesNotExistsRule parkingDoesNotExistsRule;

    public RegisterNewParkingRulesValidatorImpl(ParkingDoesNotExistsRule parkingDoesNotExistsRule) {
        this.parkingDoesNotExistsRule = parkingDoesNotExistsRule;
    }

    @Override
    public void validate(ParkingDomain data) {
        parkingDoesNotExistsRule.validate(data.getId());
    }
}
