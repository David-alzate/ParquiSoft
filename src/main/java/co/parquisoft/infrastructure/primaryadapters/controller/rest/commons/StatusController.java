package co.parquisoft.infrastructure.primaryadapters.controller.rest.commons;

import co.parquisoft.application.primaryports.dto.commons.StatusDTO;
import co.parquisoft.application.primaryports.interactor.commons.status.GetStatusInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.commons.StatusResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/status")
public class StatusController {

    private final GetStatusInteractor getStatusInteractor;

    public StatusController(GetStatusInteractor getStatusInteractor) {
        this.getStatusInteractor = getStatusInteractor;
    }

    @GetMapping
    public ResponseEntity<StatusResponse> getIdTypes() {
        try {
            List<StatusDTO> data = getStatusInteractor.execute();
            var response = StatusResponse.build(List.of("Estados consultados exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException ex) {
            var response = StatusResponse.build(List.of(ex.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception ex) {
            var userMessage = "Se ha presentado un problema tratando de consultar los estados";
            var response = StatusResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
