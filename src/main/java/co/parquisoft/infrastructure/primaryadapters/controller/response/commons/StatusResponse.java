package co.parquisoft.infrastructure.primaryadapters.controller.response.commons;

import co.parquisoft.application.primaryports.dto.commons.StatusTO;

import java.util.ArrayList;
import java.util.List;

public class StatusResponse {

    private List<String> mensajes;
    private List<StatusTO> datos;

    public StatusResponse() {
        this.mensajes = new ArrayList<>();
        this.datos = new ArrayList<>();
    }

    public List<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<String> mensajes) {
        this.mensajes = mensajes;
    }

    public List<StatusTO> getDatos() {
        return datos;
    }

    public void setDatos(List<StatusTO> datos) {
        this.datos = datos;
    }

}
