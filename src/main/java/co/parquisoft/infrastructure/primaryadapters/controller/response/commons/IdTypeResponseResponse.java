package co.parquisoft.infrastructure.primaryadapters.controller.response.commons;

import co.parquisoft.application.primaryports.dto.commons.IdTypeDTO;

import java.util.ArrayList;
import java.util.List;

public class IdTypeResponseResponse {

	private List<String> mensajes;
	private List<IdTypeDTO> datos;

	public IdTypeResponseResponse() {
		this.mensajes = new ArrayList<>();
		this.datos = new ArrayList<>();
	}

	public List<String> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<String> mensajes) {
		this.mensajes = mensajes;
	}

	public List<IdTypeDTO> getDatos() {
		return datos;
	}

	public void setDatos(List<IdTypeDTO> datos) {
		this.datos = datos;
	}

}
