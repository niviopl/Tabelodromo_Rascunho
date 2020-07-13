package br.com.tabelodromo.Operacao.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Operação Inexistente")
public class OperacaoNotFoundException   extends RuntimeException {

}
