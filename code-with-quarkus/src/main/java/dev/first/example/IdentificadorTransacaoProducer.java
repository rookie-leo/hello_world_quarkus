package dev.first.example;

import io.quarkus.arc.profile.IfBuildProfile;

import javax.enterprise.inject.spi.InjectionPoint;
import javax.enterprise.inject.Produces;

public class IdentificadorTransacaoProducer {

    @Produces
    public IdentificadorTransacao produceTest(InjectionPoint injectionPoint) {
        return new IdentificadorTransacao("Test-");
    }

    @Produces
    @IfBuildProfile("prod")
    public IdentificadorTransacao produceProd(InjectionPoint injectionPoint) {
        return new IdentificadorTransacao("Prod-");
    }

}
