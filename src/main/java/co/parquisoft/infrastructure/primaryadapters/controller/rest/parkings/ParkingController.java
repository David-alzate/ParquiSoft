package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.ParkingDTO;
import co.parquisoft.application.primaryports.interactor.parkings.parking.GetParkingsInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.parkings.ParkingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
public class ParkingController {

    private final GetParkingsInteractor getParkingsInteractor;

    public ParkingController(GetParkingsInteractor getParkingsInteractor) {
        this.getParkingsInteractor = getParkingsInteractor;
    }

    @GetMapping
    public ResponseEntity<ParkingResponse> getIdTypes() {
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
}
