package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.StateDTO;
import co.parquisoft.application.primaryports.interactor.parkings.state.GetStatesInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.parkings.StateResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/state")
public class StateController {

    private final GetStatesInteractor getStatesInteractor;

    public StateController(GetStatesInteractor getStatesInteractor) {
        this.getStatesInteractor = getStatesInteractor;
    }

    @GetMapping
    public ResponseEntity<StateResponse> getIdTypes() {
        try {
            List<StateDTO> data = getStatesInteractor.execute();
            var response = StateResponse.build(List.of("Departamentos consultados exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException exception) {
            var response = StateResponse.build(List.of(exception.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar los departamentos";
            var response = StateResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
