package br.com.tabelodromo.Conta.controllers;

import br.com.tabelodromo.Conta.models.Conta;
import br.com.tabelodromo.Conta.models.dto.GetContaResponse;
import br.com.tabelodromo.Conta.models.mapper.ContaMapper;
import br.com.tabelodromo.Conta.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContaController {
    @Autowired
    private ContaService contaService;

    @Autowired
    private ContaMapper contaMapper;

    @PostMapping
    public Conta create(@RequestBody Conta conta) {
        return contaService.create(conta);
    }

    @GetMapping("/{id}")
    public GetContaResponse getById(@PathVariable Long id) {
        Conta byId = contaService.getById(id);
        return contaMapper.toGetResponse(byId);
    }

}
