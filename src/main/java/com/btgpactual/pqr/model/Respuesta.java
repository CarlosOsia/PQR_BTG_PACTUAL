package com.btgpactual.pqr.model;

import org.springframework.data.mongodb.core.mapping.*;


@Document(collection = "respuesta")
public class Respuesta extends BaseModelo {

    private String mensaje;
    private String usuario;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
