package com.felipe.reserva;

import com.felipe.cliente.Cliente;
import com.felipe.cliente.ClienteRestClient;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/reserva-rest-client")
public class ReservaResouce {

    @Inject
    @RestClient
    private ReservaRestClient reservaRestClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String save() {
        Reserva reserva = Reserva.of(0L, 1L);
        return reservaRestClient.save(reserva);
    }
}
