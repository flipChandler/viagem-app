package com.felipe.cliente;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("api/cliente-client")
public class ClienteResource {

    @Inject
    @RestClient
    private ClienteRestClient clientServiceClient;

    @GET
    public Response save() {
        Cliente cliente = Cliente.of(1L, "Remoto");
        Response response = clientServiceClient.save(cliente);

        return Response.status(Response.Status.CREATED)
                .entity(response)
                .build();
    }
}
