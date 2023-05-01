package com.felipe.cliente;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("api/cliente-rest-client")
public class ClienteResource {

    @Inject
    @RestClient
    private ClienteRestClient clientServiceClient;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente findById(@PathParam("id") Long id) {
        return clientServiceClient.findById(id);
    }

    @GET
    public String save() {
        Cliente cliente = Cliente.of(1L, "Remoto");
        return clientServiceClient.save(cliente);
    }
}
