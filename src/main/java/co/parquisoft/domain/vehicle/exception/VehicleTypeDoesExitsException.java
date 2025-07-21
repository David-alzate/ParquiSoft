package co.parquisoft.domain.vehicle.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class VehicleTypeDoesExitsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public VehicleTypeDoesExitsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static VehicleTypeDoesExitsException create() {
        var userMessage = "El tipo de vehículo ya existe";
        return new VehicleTypeDoesExitsException(userMessage);
    }
}
