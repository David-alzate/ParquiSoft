package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.BranchDTO;
import co.parquisoft.application.primaryports.interactor.parkings.branch.DeleteBranchInteractor;
import co.parquisoft.application.primaryports.interactor.parkings.branch.GetBranchsInteractor;
import co.parquisoft.application.primaryports.interactor.parkings.branch.RegisterNewBranchInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenericResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.parkings.BranchResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/branch")
public class BranchController {

    private final GetBranchsInteractor getBranchsInteractor;
    private final RegisterNewBranchInteractor registerNewBranchInteractor;
    private final DeleteBranchInteractor deleteBranchInteractor;

    public BranchController(GetBranchsInteractor getBranchsInteractor, RegisterNewBranchInteractor registerNewBranchInteractor, DeleteBranchInteractor deleteBranchInteractor) {
        this.getBranchsInteractor = getBranchsInteractor;
        this.registerNewBranchInteractor = registerNewBranchInteractor;
        this.deleteBranchInteractor = deleteBranchInteractor;
    }

    @GetMapping
    public ResponseEntity<BranchResponse> getBranchs() {
        try {
            List<BranchDTO> data = getBranchsInteractor.execute();
            var response = BranchResponse.build(List.of("Sedes consultadas exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException exception) {
            var response = BranchResponse.build(List.of(exception.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar las Sedes";
            var response = BranchResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<GenericResponse> registerNewParking(@RequestBody BranchDTO branch) {
        try {
            registerNewBranchInteractor.execute(branch);
            return GenerateResponse.generateSuccessResponse(List.of("Se ha registrado la sede exitosamente"));
        } catch (final ParquiSoftException exception) {
            return GenerateResponse.generateBadRequestResponse(List.of(exception.getUserMessage()));
        } catch (final Exception exception) {
            return GenerateResponse.generateBadRequestResponse(List.of("Se ha presendatado un problema tratando de llevar a cabo el registro la sede"));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable UUID id) {
        try {
            deleteBranchInteractor.execute(id);
            return GenerateResponse.generateSuccessResponse(List.of("Se ha eliminado la sede exitosamente"));
        } catch (final ParquiSoftException exception) {
            return GenerateResponse.generateBadRequestResponse(List.of(exception.getUserMessage()));
        } catch (final Exception exception) {
            return GenerateResponse.generateBadRequestResponse(List.of("Se ha presendatado un problema tratando de llevar a cabo la eliminacion de la sede"));
        }
    }
}
