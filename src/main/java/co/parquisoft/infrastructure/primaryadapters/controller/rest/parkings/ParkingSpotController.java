package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.ParkingSpotDTO;
import co.parquisoft.application.primaryports.interactor.parkings.parkingspot.RegisterNewParkingSpotInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenericResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parkingspot")
public class ParkingSpotController {

    private final RegisterNewParkingSpotInteractor registerNewParkingSpotInteractor;

    public ParkingSpotController(RegisterNewParkingSpotInteractor registerNewParkingSpotInteractor) {
        this.registerNewParkingSpotInteractor = registerNewParkingSpotInteractor;
    }

    @PostMapping
    public ResponseEntity<GenericResponse> registerNewParkingSpot(@RequestBody ParkingSpotDTO parking) {
        try {
            registerNewParkingSpotInteractor.execute(parking);
            return GenerateResponse.generateSuccessResponse(List.of("Se ha registrado la celda correctamente"));
        } catch (final ParquiSoftException exception) {
            return GenerateResponse.generateBadRequestResponse(List.of(exception.getUserMessage()));
        } catch (final Exception exception) {
            return GenerateResponse.generateBadRequestResponse(List.of("Se ha presendatado un problema tratando de llevar a cabo el registro de la celda"));
        }
    }


}
