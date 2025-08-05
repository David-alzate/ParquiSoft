package co.parquisoft.domain.vehicle.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;
import co.parquisoft.domain.commons.status.exception.StatusDoesExistsException;

public class VehicleDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public VehicleDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static StatusDoesExistsException create() {
        var userMessage = "El vehículo no existe";
        return new StatusDoesExistsException(userMessage);
    }
}
