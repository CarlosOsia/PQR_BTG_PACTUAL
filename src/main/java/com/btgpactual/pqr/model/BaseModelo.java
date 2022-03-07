package com.btgpactual.pqr.model;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.time.*;

public abstract class BaseModelo {

    @Id
    private String id;
    @CreatedDate
    private LocalDateTime fechaCreacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
