package co.parquisoft.infrastructure.primaryadapters.controller.rest.commons;

import co.parquisoft.application.primaryports.dto.commons.StatusTO;
import co.parquisoft.application.primaryports.interactor.commons.status.GetStatusInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.commons.StatusResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general/api/v1/estados")
public class StatusController {

    private final GetStatusInteractor consultarEstadoInteractor;

    public StatusController(GetStatusInteractor consultarEstadoInteractor) {
        this.consultarEstadoInteractor = consultarEstadoInteractor;
    }

    @GetMapping
    public ResponseEntity<StatusResponse> consultarEstados() {
        var httpStatusCode = HttpStatus.ACCEPTED;
        var estadoResponse = new StatusResponse();

        try {
            var estadoDTO = StatusTO.create();
            estadoResponse.setDatos(consultarEstadoInteractor.execute(estadoDTO));
            estadoResponse.getMensajes().add("Estados consultados exitosamente");

        } catch (final ParquiSoftException excepcion) {
            httpStatusCode = HttpStatus.BAD_REQUEST;
            estadoResponse.getMensajes().add(excepcion.getUserMessage());
        } catch (final Exception excepcion) {
            httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
            var mensajeUsuario = "Se ha presentado un problema tratando de consultar los estados";
            estadoResponse.getMensajes().add(mensajeUsuario);
        }

        return new ResponseEntity<>(estadoResponse, httpStatusCode);
    }

}
