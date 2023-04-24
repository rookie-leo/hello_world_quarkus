package dev.first.example;

import dev.first.example.entities.Fruta;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/frutas")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> listar() {
        return Fruta.listAll();
    }

    @POST
    @Transactional
    public void novaFruta() {
        Fruta fruta = new Fruta();
        fruta.setNome("Limão");
        fruta.setQtde(12);
        fruta.persist();
    }
}