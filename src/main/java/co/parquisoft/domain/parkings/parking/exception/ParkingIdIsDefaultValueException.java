package co.parquisoft.domain.parkings.parking.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class ParkingIdIsDefaultValueException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public ParkingIdIsDefaultValueException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static ParkingDoesExistsException create() {
        var userMessage = "El id del parqueadero no puede ser el valor por defecto";
        return new ParkingDoesExistsException(userMessage);
    }
}
