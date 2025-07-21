package co.parquisoft.domain.vehicle.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class VehicleTypeDoesNotExitsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public VehicleTypeDoesNotExitsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static VehicleTypeDoesNotExitsException create() {
        var userMessage = "El tipo de vehículo no existe";
        return new VehicleTypeDoesNotExitsException(userMessage);
    }
}
