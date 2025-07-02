package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.BranchTypeDTO;
import co.parquisoft.application.primaryports.interactor.parkings.branch.GetBranchTypeInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.parkings.BranchTypeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/branchtype")
public class BranchTypeController {

    private final GetBranchTypeInteractor getBranchTypeInteractor;

    public BranchTypeController(GetBranchTypeInteractor getBranchTypeInteractor) {
        this.getBranchTypeInteractor = getBranchTypeInteractor;
    }

    @GetMapping
    public ResponseEntity<BranchTypeResponse> getCities() {
        try {
            List<BranchTypeDTO> data = getBranchTypeInteractor.execute();
            var response = BranchTypeResponse.build(List.of("Tipos de sede consultadas exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException exception) {
            var response = BranchTypeResponse.build(List.of(exception.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar los tipos de sede";
            var response = BranchTypeResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
