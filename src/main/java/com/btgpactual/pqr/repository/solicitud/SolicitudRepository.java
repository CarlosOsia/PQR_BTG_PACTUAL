package com.btgpactual.pqr.repository.solicitud;

import com.btgpactual.pqr.model.*;
import org.springframework.data.mongodb.repository.*;

public interface SolicitudRepository extends MongoRepository<Solicitud, String> {

}
