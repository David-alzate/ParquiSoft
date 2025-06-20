package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.CityDTO;
import co.parquisoft.application.primaryports.interactor.parkings.city.GetCitiesInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.parkings.CityResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/city")
public class CityController {

    private final GetCitiesInteractor getCitiesInteractor;

    public CityController(GetCitiesInteractor getCitiesInteractor) {
        this.getCitiesInteractor = getCitiesInteractor;
    }

    @GetMapping
    public ResponseEntity<CityResponse> getIdTypes() {
        try {
            List<CityDTO> data = getCitiesInteractor.execute();
            var response = CityResponse.build(List.of("Ciudades consultadas exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException exception) {
            var response = CityResponse.build(List.of(exception.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar las ciudades";
            var response = CityResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
