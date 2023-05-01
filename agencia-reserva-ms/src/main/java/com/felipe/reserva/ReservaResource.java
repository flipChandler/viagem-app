package com.felipe.reserva;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("api/reservas")
public class ReservaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reserva> listAll() {
        return Reserva.listAll();
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Reserva save(Reserva reserva) {
        reserva.id = null;
        reserva.persist();

        return reserva;
    }
}
