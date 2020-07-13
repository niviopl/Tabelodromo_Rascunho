package br.com.tabelodromo.Cliente.services;

import br.com.tabelodromo.Cliente.exceptions.ClienteNotFoundException;
import br.com.tabelodromo.Cliente.models.Cliente;
import br.com.tabelodromo.Cliente.repositories.ClienteRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente atualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletar(Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    public Cliente buscarPorId(Long id) {
        Optional<Cliente> byId = clienteRepository.findById(id);
        if(!byId.isPresent()) {
            throw new ClienteNotFoundException();
        }
        return byId.get();
    }

}
