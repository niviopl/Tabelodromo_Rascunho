package br.com.tabelodromo.Cliente.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cliente Inexistente")
public class ClienteNotFoundException  extends RuntimeException{

}
