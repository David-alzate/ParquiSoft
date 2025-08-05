package co.parquisoft.domain.vehicle.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;
import co.parquisoft.domain.commons.status.exception.StatusDoesExistsException;

public class VehicleDoesExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public VehicleDoesExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static StatusDoesExistsException create() {
        var userMessage = "Ya existe el vehículo";
        return new StatusDoesExistsException(userMessage);
    }
}
