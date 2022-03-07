package com.btgpactual.pqr.service.solicitud;

import com.btgpactual.pqr.model.*;

import java.util.*;

public interface SolicitudService {
    List<Solicitud> findAll();
    Solicitud show(String id);
    Solicitud save(Solicitud solicitud);
    Solicitud update(String id, Solicitud solicitud);
    Solicitud demand(String id, Solicitud solicitud);
}
