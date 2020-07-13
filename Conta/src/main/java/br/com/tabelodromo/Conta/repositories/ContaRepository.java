package br.com.tabelodromo.Conta.repositories;

import br.com.tabelodromo.Conta.models.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta, Long> {

}
