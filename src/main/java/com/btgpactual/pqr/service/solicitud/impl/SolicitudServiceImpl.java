package com.btgpactual.pqr.service.solicitud.impl;

import com.btgpactual.pqr.model.*;
import com.btgpactual.pqr.repository.solicitud.*;
import com.btgpactual.pqr.service.solicitud.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.server.*;

import java.util.*;

@Service
public class SolicitudServiceImpl implements SolicitudService {
    private final SolicitudRepository repository;

    @Autowired
    public SolicitudServiceImpl(SolicitudRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Solicitud> findAll() {
        return repository.findAll();
    }

    @Override
    public Solicitud show(String id) {
        return repository.findById(id).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "solicitud #"+ id +" not found")
        );
    }

    @Override
    public Solicitud save(Solicitud solicitud) {
        return repository.save(solicitud);
    }

    @Override
    public Solicitud update(String id, Solicitud solicitud) {
        var solicitudFound = repository.findById(id).orElseThrow( ()->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "solicitud #"+ id +" not found")
        );
        if(solicitud.getMensaje() != null){
            solicitudFound.setMensaje(solicitud.getMensaje());
        }
        if(solicitud.getNumeroRadicado() != null){
            solicitudFound.setNumeroRadicado(solicitud.getNumeroRadicado());
        }
        if(solicitud.getUsuario() != null){
            solicitudFound.setUsuario(solicitud.getUsuario());
        }
        if(solicitud.getTipo() != null){
            solicitudFound.setTipo(solicitud.getTipo());
        }
        return save(solicitudFound);
    }
}
