package co.parquisoft.infrastructure.primaryadapters.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.parquisoft.application.primaryports.dto.EstadoDTO;
import co.parquisoft.application.primaryports.interactor.estado.ConsultarEstadoInteractor;
import co.parquisoft.crosscutting.exception.enums.GeneralesException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.EstadoResponse;

@RestController
@RequestMapping("/general/api/v1/estados")
public class EstadoController {

	private ConsultarEstadoInteractor consultarEstadoInteractor;

	public EstadoController(ConsultarEstadoInteractor consultarEstadoInteractor) {
		this.consultarEstadoInteractor = consultarEstadoInteractor;
	}

	@GetMapping
	public ResponseEntity<EstadoResponse> consultarEstados() {
		var httpStatusCode = HttpStatus.ACCEPTED;
		var estadoResponse = new EstadoResponse();

		try {
			var estadoDTO = EstadoDTO.create();
			estadoResponse.setDatos(consultarEstadoInteractor.execute(estadoDTO));
			estadoResponse.getMensajes().add("Estados consultados exitosamente");

		} catch (final GeneralesException excepcion) {
			httpStatusCode = HttpStatus.BAD_REQUEST;
			estadoResponse.getMensajes().add(excepcion.getUserMessage());
			excepcion.printStackTrace();
		} catch (final Exception excepcion) {
			httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
			var mensajeUsuario = "Se ha presentado un problema tratando de consultar los estados";
			estadoResponse.getMensajes().add(mensajeUsuario);
			excepcion.printStackTrace();
		}

		return new ResponseEntity<>(estadoResponse, httpStatusCode);
	}

}
