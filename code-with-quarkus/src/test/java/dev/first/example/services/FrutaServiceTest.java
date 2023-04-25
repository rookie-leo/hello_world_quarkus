package dev.first.example.services;

import dev.first.example.entities.Fruta;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class FrutaServiceTest {

    @Inject
    FrutaService service;

    @Test
    public void testListarService() {
        List<Fruta> frutas = service.listar();
        assertFalse(frutas.isEmpty());
    }

}