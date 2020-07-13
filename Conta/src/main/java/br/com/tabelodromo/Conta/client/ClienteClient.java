package br.com.tabelodromo.Conta.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cliente")
public interface ClienteClient {

    @GetMapping("/{id}")
    ClienteDTO getById(@PathVariable Long id);
}
