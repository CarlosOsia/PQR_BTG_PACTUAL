package com.btgpactual.pqr.controller.solicitud;


import com.btgpactual.pqr.model.*;
import com.btgpactual.pqr.service.solicitud.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class SolicitudController {

    private final SolicitudService service;

    @Autowired
    public SolicitudController(SolicitudService service) {
        this.service = service;
    }

    @GetMapping
    public List<Solicitud> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Solicitud show(@PathVariable String id){
        return service.show(id);
    }

    @PostMapping
    public Solicitud save(@RequestBody Solicitud solicitud){
        return service.save(solicitud);
    }

    @PatchMapping("/{id}")
    public Solicitud show(@PathVariable String id, @RequestBody Solicitud solicitud){
        return service.update(id, solicitud);
    }
}
