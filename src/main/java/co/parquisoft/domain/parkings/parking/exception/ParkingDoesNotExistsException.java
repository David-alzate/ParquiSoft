package co.parquisoft.domain.parkings.parking.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class ParkingDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public ParkingDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static ParkingDoesNotExistsException create() {
        var userMessage = "El parqueadero no existe";
        return new ParkingDoesNotExistsException(userMessage);
    }
}
