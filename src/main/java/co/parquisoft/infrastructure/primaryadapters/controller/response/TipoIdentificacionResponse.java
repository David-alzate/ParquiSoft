package co.parquisoft.infrastructure.primaryadapters.controller.response;

import co.parquisoft.application.primaryports.dto.TipoIdentificacionDTO;

import java.util.ArrayList;
import java.util.List;

public class TipoIdentificacionResponse {

	private List<String> mensajes;
	private List<TipoIdentificacionDTO> datos;

	public TipoIdentificacionResponse() {
		this.mensajes = new ArrayList<>();
		this.datos = new ArrayList<>();
	}

	public List<String> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<String> mensajes) {
		this.mensajes = mensajes;
	}

	public List<TipoIdentificacionDTO> getDatos() {
		return datos;
	}

	public void setDatos(List<TipoIdentificacionDTO> datos) {
		this.datos = datos;
	}

}
