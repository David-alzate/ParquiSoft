package co.parquisoft.infrastructure.primaryadapters.controller.rest.parkings;

import co.parquisoft.application.primaryports.dto.parkings.CountryDTO;
import co.parquisoft.application.primaryports.interactor.parkings.country.GetCountriesInteractor;
import co.parquisoft.crosscutting.exception.ParquiSoftException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.GenerateResponse;
import co.parquisoft.infrastructure.primaryadapters.controller.response.parkings.CountryResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController {

    private final GetCountriesInteractor getCountriesInteractor;

    public CountryController(GetCountriesInteractor getCountriesInteractor) {
        this.getCountriesInteractor = getCountriesInteractor;
    }

    @GetMapping
    public ResponseEntity<CountryResponse> getIdTypes() {
        try {
            List<CountryDTO> data = getCountriesInteractor.execute();
            var response = CountryResponse.build(List.of("Paises consultadas exitosamente"), data);
            return GenerateResponse.generateSuccessResponseWithData(response);
        } catch (final ParquiSoftException exception) {
            var response = CountryResponse.build(List.of(exception.getUserMessage()), List.of());
            return GenerateResponse.generateBadRequestResponseWithData(response);
        } catch (final Exception exception) {
            var userMessage = "Se ha presentado un problema tratando de consultar los Paises";
            var response = CountryResponse.build(List.of(userMessage), List.of());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
