package com.felipe.reserva;

import com.felipe.cliente.Cliente;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/reserva-client")
public class ReservaResouce {

    @Inject
    @RestClient
    private ReservaRestClient reservaRestClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String save() {
        Cliente cliente = Cliente.of(2L, "");
        return reservaRestClient.save(cliente);
    }

}
