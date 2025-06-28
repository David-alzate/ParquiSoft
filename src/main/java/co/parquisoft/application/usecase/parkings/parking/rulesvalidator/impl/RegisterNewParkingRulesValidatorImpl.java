package co.parquisoft.application.usecase.parkings.parking.rulesvalidator.impl;

import co.parquisoft.application.usecase.parkings.parking.rulesvalidator.RegisterNewParkingRulesValidator;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import co.parquisoft.domain.parkings.parking.rules.ParkingDoesNotExistsRule;
import co.parquisoft.domain.parkings.parking.rules.ParkingIdIsNotDefaultValueRule;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingRulesValidatorImpl implements RegisterNewParkingRulesValidator {

    private final ParkingDoesNotExistsRule parkingDoesNotExistsRule;
    private final ParkingIdIsNotDefaultValueRule parkingIdIsNotDefaultValueRule;

    public RegisterNewParkingRulesValidatorImpl(ParkingDoesNotExistsRule parkingDoesNotExistsRule, ParkingIdIsNotDefaultValueRule parkingIdIsNotDefaultValueRule) {
        this.parkingDoesNotExistsRule = parkingDoesNotExistsRule;
        this.parkingIdIsNotDefaultValueRule = parkingIdIsNotDefaultValueRule;
    }

    @Override
    public void validate(ParkingDomain data) {
        parkingDoesNotExistsRule.validate(data.getId());
        parkingIdIsNotDefaultValueRule.validate(data.getId());
    }
}
