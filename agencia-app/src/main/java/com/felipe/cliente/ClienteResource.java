package com.felipe.cliente;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.annotations.Param;
import org.jboss.resteasy.plugins.providers.ReactiveStreamProvider;

import java.util.List;

@Path("api/clientes")
public class ClienteResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> listAll() {
        return Cliente.listAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente findById(@PathParam("id") Long id) {
        return Cliente.findById(id);
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(Cliente cliente) {
        cliente.id = null;
        cliente.persist();

        return Response.status(Response.Status.CREATED)
                .entity(cliente)
                .build();
    }

    @DELETE
    @Path("{id}")
    public void deletById(@PathParam("id") Long id) {
        Cliente.deleteById(id);
    }
}
