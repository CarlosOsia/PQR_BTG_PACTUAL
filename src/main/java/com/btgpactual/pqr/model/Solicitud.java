package com.btgpactual.pqr.model;

import org.springframework.data.mongodb.core.mapping.*;

@Document(collection = "solicitudes")
public class Solicitud extends BaseModelo{

    private String numeroRadicado;
    private String mensaje;
    private String tipo;
    private String usuario;
    private Solicitud solicitudPadre;
    private Respuesta respuesta;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNumeroRadicado() {
        return numeroRadicado;
    }

    public void setNumeroRadicado(String numeroRadicado) {
        this.numeroRadicado = numeroRadicado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Solicitud getSolicitudPadre() {
        return solicitudPadre;
    }

    public void setSolicitudPadre(Solicitud solicitudPadre) {
        this.solicitudPadre = solicitudPadre;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }
}
