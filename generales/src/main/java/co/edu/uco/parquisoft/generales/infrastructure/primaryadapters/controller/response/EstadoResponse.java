package co.edu.uco.parquisoft.generales.infrastructure.primaryadapters.controller.response;

import java.util.ArrayList;
import java.util.List;

import co.edu.uco.parquisoft.generales.application.primaryports.dto.EstadoDTO;

public class EstadoResponse {

	private List<String> mensajes;
	private List<EstadoDTO> datos;

	public EstadoResponse() {
		this.mensajes = new ArrayList<>();
		this.datos = new ArrayList<>();
	}

	public List<String> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<String> mensajes) {
		this.mensajes = mensajes;
	}

	public List<EstadoDTO> getDatos() {
		return datos;
	}

	public void setDatos(List<EstadoDTO> datos) {
		this.datos = datos;
	}

}
