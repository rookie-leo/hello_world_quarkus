package dev.first.example;

import dev.first.example.entities.Fruta;
import dev.first.example.entities.FrutaRequest;
import dev.first.example.services.FrutaService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/frutas")
public class FrutasResource {

    @Inject
    FrutaService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> listar() {
        return service.listar();
    }

    @POST
    public void novaFruta(FrutaRequest request) {
        service.cadatrarFurta(request);
    }
}