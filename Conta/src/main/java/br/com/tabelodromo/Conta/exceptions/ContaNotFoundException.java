package br.com.tabelodromo.Conta.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Conta Inexistente")
public class ContaNotFoundException extends RuntimeException{
}

