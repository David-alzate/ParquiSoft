package co.parquisoft.infrastructure.primaryadapters.controller.rest.commons;

import co.parquisoft.application.primaryports.dto.commons.IdTypeDTO;
import co.parquisoft.application.primaryports.interactor.commons.idtype.GetIdTypeInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.commons.IdTypeResponseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general/api/v1/tipoidentificacion")
public class IdTypeController {

    private final GetIdTypeInteractor consultarTIdentificacionInteractor;

    public IdTypeController(GetIdTypeInteractor consultarTIdentificacionInteractor) {
        this.consultarTIdentificacionInteractor = consultarTIdentificacionInteractor;
    }

    @GetMapping
    public ResponseEntity<IdTypeResponseResponse> consultarTipoIdentificaciones() {
        var httpStatusCode = HttpStatus.ACCEPTED;
        var tipoIdentificacionResponse = new IdTypeResponseResponse();

        try {
            var tipoIdentificacionDTO = IdTypeDTO.create();
            tipoIdentificacionResponse.setDatos(consultarTIdentificacionInteractor.execute(tipoIdentificacionDTO));
            tipoIdentificacionResponse.getMensajes().add("Tipos de Identificación consultados exitosamente");

        } catch (final ParquiSoftException excepcion) {
            httpStatusCode = HttpStatus.BAD_REQUEST;
            tipoIdentificacionResponse.getMensajes().add(excepcion.getUserMessage());
        } catch (final Exception excepcion) {
            httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
            var mensajeUsuario = "Se ha presentado un problema tratando de consultar los tipos de identificación";
            tipoIdentificacionResponse.getMensajes().add(mensajeUsuario);
        }

        return new ResponseEntity<>(tipoIdentificacionResponse, httpStatusCode);
    }
}
