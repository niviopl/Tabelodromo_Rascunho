package br.com.tabelodromo.Operacao.repositories;

import br.com.tabelodromo.Operacao.models.Operacao;
import org.springframework.data.repository.CrudRepository;

public interface OperacaoRepository  extends CrudRepository<Operacao, Long> {

}
