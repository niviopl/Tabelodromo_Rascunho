package br.com.tabelodromo.Limite.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Limite Inexistente")
public class LimiteNotFoundException   extends RuntimeException {

}
