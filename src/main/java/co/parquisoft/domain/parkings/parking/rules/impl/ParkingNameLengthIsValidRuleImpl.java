package co.parquisoft.domain.parkings.parking.rules.impl;

import co.parquisoft.domain.parkings.parking.exception.ParkingNameLengthIsNotValidException;
import co.parquisoft.domain.parkings.parking.rules.ParkingNameLengthIsValidRule;
import org.springframework.stereotype.Service;

@Service
public class ParkingNameLengthIsValidRuleImpl implements ParkingNameLengthIsValidRule {

    @Override
    public void validate(String data) {
        if (data.length() < 3 || data.length() > 30) {
            throw ParkingNameLengthIsNotValidException.create();
        }
    }
}
