package co.parquisoft.domain.parkings.parkingspot.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class ParkingSpotDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public ParkingSpotDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static ParkingSpotDoesNotExistsException create() {
        var userMessage = "La celda no existe";
        return new ParkingSpotDoesNotExistsException(userMessage);
    }
}
