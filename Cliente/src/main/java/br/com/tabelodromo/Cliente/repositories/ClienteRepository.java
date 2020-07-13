package br.com.tabelodromo.Cliente.repositories;

import br.com.tabelodromo.Cliente.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository  extends CrudRepository<Cliente, Long> {


}
