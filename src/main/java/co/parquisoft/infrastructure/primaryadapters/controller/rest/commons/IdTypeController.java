package co.parquisoft.infrastructure.primaryadapters.controller.rest.commons;

import co.parquisoft.application.primaryports.dto.commons.IdTypeDTO;
import co.parquisoft.application.primaryports.interactor.commons.idtype.GetIdTypeInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.commons.IdTypeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/idtype")
public class IdTypeController {

    private final GetIdTypeInteractor getIdTypeInteractor;

    public IdTypeController(GetIdTypeInteractor getIdTypeInteractor) {
        this.getIdTypeInteractor = getIdTypeInteractor;
    }

    @GetMapping
    public ResponseEntity<IdTypeResponse> getIdTypes() {
        try {
            List<IdTypeDTO> data = getIdTypeInteractor.execute();
            var response = IdTypeResponse.build(List.of("Tipos de Identificación consultados exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException exception) {
            var response = IdTypeResponse.build(List.of(exception.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar los tipos de identificación";
            var response = IdTypeResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
