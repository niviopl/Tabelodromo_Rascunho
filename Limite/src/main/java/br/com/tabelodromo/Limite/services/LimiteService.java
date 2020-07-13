package br.com.tabelodromo.Limite.services;

import br.com.tabelodromo.Limite.exceptions.LimiteNotFoundException;
import br.com.tabelodromo.Limite.models.Limite;
import br.com.tabelodromo.Limite.repositories.LimiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LimiteService {

    @Autowired
    LimiteRepository limiteRepository;

    public Limite salvar(Limite limite) {
        return limiteRepository.save(limite);
    }

    public Iterable<Limite> buscarTodos() {
        return limiteRepository.findAll();
    }

    public Limite atualizar(Limite limite) {
        return limiteRepository.save(limite);
    }

    public void deletar(Limite limite) {
        limiteRepository.delete(limite);
    }

    public Limite buscarPorId(Long id) {
        Optional<Limite> byId = limiteRepository.findById(id);
        if(!byId.isPresent()) {
            throw new LimiteNotFoundException();
        }
        return byId.get();
    }

}
