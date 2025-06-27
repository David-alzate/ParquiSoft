package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.ParkingDTO;
import co.parquisoft.application.primaryports.interactor.parkings.parking.GetParkingsInteractor;
import co.parquisoft.application.primaryports.interactor.parkings.parking.RegisterNewParkingInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenericResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.parkings.ParkingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
public class ParkingController {

    private final GetParkingsInteractor getParkingsInteractor;
    private final RegisterNewParkingInteractor registerNewParkingInteractor;

    public ParkingController(GetParkingsInteractor getParkingsInteractor, RegisterNewParkingInteractor registerNewParkingInteractor) {
        this.getParkingsInteractor = getParkingsInteractor;
        this.registerNewParkingInteractor = registerNewParkingInteractor;
    }

    @GetMapping
    public ResponseEntity<ParkingResponse> getParkings() {
        try {
            List<ParkingDTO> data = getParkingsInteractor.execute();
            var response = ParkingResponse.build(List.of("Parqueaderos consultadas exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException exception) {
            var response = ParkingResponse.build(List.of(exception.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar los Parqueaderos";
            var response = ParkingResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<GenericResponse> registerNewParking(@RequestBody ParkingDTO parking) {
        try {
            registerNewParkingInteractor.execute(parking);
            return GenerateResponse.generateSuccessResponse(List.of("Se ha agregado el parqueadero exitosamente"));
        } catch (final ParquiSoftException exception) {
            return GenerateResponse.generateBadRequestResponse(List.of(exception.getUserMessage()));
        } catch (final Exception exception) {
            return GenerateResponse.generateBadRequestResponse(List.of("Se ha presendatado un problema tratando de llevar a cabo el registro del parqueadero"));
        }
    }

}
