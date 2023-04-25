package dev.first.example.services;

import dev.first.example.entities.Fruta;
import dev.first.example.entities.FrutaRequest;
import dev.first.example.IdentificadorTransacao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class FrutaService {

    @Inject
    IdentificadorTransacao identificadorTransacao;

    public List<Fruta> listar() {
        System.out.println(identificadorTransacao.getIdentificadorTransacao());
        return Fruta.listAll();
    }

    @Transactional
    public void cadatrarFurta(FrutaRequest request) {
        System.out.println(identificadorTransacao.getIdentificadorTransacao());
        Fruta fruta = new Fruta();
        fruta.setNome(request.nome);
        fruta.setQtde(request.qtde);
        fruta.persist();
    }

}
