package com.felipe.cliente;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8181/api/clientes")
public interface ClienteRestClient {

    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    Cliente findById(@PathParam("id") Long id);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    String save(Cliente cliente);
}
