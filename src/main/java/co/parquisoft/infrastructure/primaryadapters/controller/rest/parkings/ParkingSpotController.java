package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.ParkingSpotDTO;
import co.parquisoft.application.primaryports.interactor.parkings.parkingspot.GetParkingSpotInteractor;
import co.parquisoft.application.primaryports.interactor.parkings.parkingspot.RegisterNewParkingSpotInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenericResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.parkings.ParkingSpotResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parkingspot")
public class ParkingSpotController {

    private final RegisterNewParkingSpotInteractor registerNewParkingSpotInteractor;
    private final GetParkingSpotInteractor getParkingSpotInteractor;

    public ParkingSpotController(RegisterNewParkingSpotInteractor registerNewParkingSpotInteractor, GetParkingSpotInteractor getParkingSpotInteractor) {
        this.registerNewParkingSpotInteractor = registerNewParkingSpotInteractor;
        this.getParkingSpotInteractor = getParkingSpotInteractor;
    }

    @GetMapping
    public ResponseEntity<ParkingSpotResponse> getParkings() {
        try {
            List<ParkingSpotDTO> data = getParkingSpotInteractor.execute();
            var response = ParkingSpotResponse.build(List.of("Celdas consultadas exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException exception) {
            var response = ParkingSpotResponse.build(List.of(exception.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar las celdas";
            var response = ParkingSpotResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
