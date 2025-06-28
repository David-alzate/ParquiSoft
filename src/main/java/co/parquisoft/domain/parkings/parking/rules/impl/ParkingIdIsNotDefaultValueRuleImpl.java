package co.parquisoft.domain.parkings.parking.rules.impl;

import co.parquisoft.crosscutting.helpers.UUIDHelper;
import co.parquisoft.domain.parkings.parking.exception.ParkingIdIsDefaultValueException;
import co.parquisoft.domain.parkings.parking.rules.ParkingIdIsNotDefaultValueRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ParkingIdIsNotDefaultValueRuleImpl implements ParkingIdIsNotDefaultValueRule {

    @Override
    public void validate(UUID data) {
        if (UUIDHelper.isDefault(data)) {
            throw ParkingIdIsDefaultValueException.create();
        }
    }
}
