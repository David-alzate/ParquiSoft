package co.parquisoft.domain.parkings.parking.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class ParkingDoesExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public ParkingDoesExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static ParkingDoesExistsException create() {
        var userMessage = "El parqueadero ya existe";
        return new ParkingDoesExistsException(userMessage);
    }
}
