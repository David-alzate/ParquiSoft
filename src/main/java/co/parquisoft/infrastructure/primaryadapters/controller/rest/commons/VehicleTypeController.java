package co.parquisoft.infrastructure.primaryadapters.controller.rest.commons;

import co.parquisoft.application.primaryports.dto.commons.VehicleTypeDTO;
import co.parquisoft.application.primaryports.interactor.commons.vehicletype.GetVehicleTypeInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.commons.VehicleTypeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicletype")
public class VehicleTypeController {

    private final GetVehicleTypeInteractor getVehicleTypeInteractor;

    public VehicleTypeController(GetVehicleTypeInteractor getVehicleTypeInteractor) {
        this.getVehicleTypeInteractor = getVehicleTypeInteractor;
    }

    @GetMapping
    public ResponseEntity<VehicleTypeResponse> getVehicleTypes() {
        try {
            List<VehicleTypeDTO> data = getVehicleTypeInteractor.execute();
            var resonse = VehicleTypeResponse.build(List.of("Tipos de Vehículo consultados exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(resonse);
        } catch (final ParquiSoftException exception) {
            var response = VehicleTypeResponse.build(List.of(exception.getMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar los tipos de vehiculo";
            var response = VehicleTypeResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
