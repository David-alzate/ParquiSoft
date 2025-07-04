package co.parquisoft.domain.parkings.parking.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class ParkingNameLengthIsNotValidException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public ParkingNameLengthIsNotValidException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static ParkingNameLengthIsNotValidException create() {
        var userMessage = "El nombre del parqueadero debe tener entre 3 y 30 caracteres";
        return new ParkingNameLengthIsNotValidException(userMessage);
    }
}
