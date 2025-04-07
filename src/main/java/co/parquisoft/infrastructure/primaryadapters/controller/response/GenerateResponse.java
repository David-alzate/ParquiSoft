package co.parquisoft.infrastructure.primaryadapters.controller.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public final class GenerateResponse {

    private GenerateResponse() {
    }

    public static ResponseEntity<GenericResponse> generateSuccessResponse(final List<String> messages) {
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setMessages(messages);

        return new ResponseEntity<>(genericResponse, HttpStatus.OK);
    }

    public static ResponseEntity<GenericResponse> generateBadRequestResponse(final List<String> messages) {
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setMessages(messages);

        return new ResponseEntity<>(genericResponse, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<T> generateSuccessResponseWithData(final T responseWithData) {
        return new ResponseEntity<>(responseWithData, HttpStatus.OK);
    }

    public static <T> ResponseEntity<T> generateBadRequestResponseWithData(final T responseWithData) {
        return new ResponseEntity<>(responseWithData, HttpStatus.BAD_REQUEST);
    }
}
