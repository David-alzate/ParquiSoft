package co.parquisoft.infrastructure.primaryadapters.controller.rest;

import co.parquisoft.application.primaryports.dto.TipoIdentificacionDTO;
import co.parquisoft.application.primaryports.interactor.tipoidentificacion.ConsultarTIdentificacionInteractor;
import co.parquisoft.crosscutting.exception.enums.GeneralesException;
import co.parquisoft.infrastructure.primaryadapters.controller.response.TipoIdentificacionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general/api/v1/tipoidentificacion")
public class TipoIdentificacionController {

	private ConsultarTIdentificacionInteractor consultarTIdentificacionInteractor;

	public TipoIdentificacionController(ConsultarTIdentificacionInteractor consultarTIdentificacionInteractor) {
		this.consultarTIdentificacionInteractor = consultarTIdentificacionInteractor;
	}

	@GetMapping
	public ResponseEntity<TipoIdentificacionResponse> consultarTipoIdentificaciones() {
		var httpStatusCode = HttpStatus.ACCEPTED;
		var tipoIdentificacionResponse = new TipoIdentificacionResponse();

		try {
			var tipoIdentificacionDTO = TipoIdentificacionDTO.create();
			tipoIdentificacionResponse.setDatos(consultarTIdentificacionInteractor.execute(tipoIdentificacionDTO));
			tipoIdentificacionResponse.getMensajes().add("Tipos de Identificación consultados exitosamente");

		} catch (final GeneralesException excepcion) {
			httpStatusCode = HttpStatus.BAD_REQUEST;
			tipoIdentificacionResponse.getMensajes().add(excepcion.getUserMessage());
			excepcion.printStackTrace();
		} catch (final Exception excepcion) {
			httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
			var mensajeUsuario = "Se ha presentado un problema tratando de consultar los tipos de identificación";
			tipoIdentificacionResponse.getMensajes().add(mensajeUsuario);
			excepcion.printStackTrace();
		}

		return new ResponseEntity<>(tipoIdentificacionResponse, httpStatusCode);
	}
}
