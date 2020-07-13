package br.com.tabelodromo.Limite.controllers;

import br.com.tabelodromo.Limite.models.Limite;
import br.com.tabelodromo.Limite.services.LimiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/limite")
public class LimiteController {

    @Autowired
    private LimiteService limiteService;

    @GetMapping
    public ResponseEntity<Iterable<Limite>> buscarTodos() {
        try {
            return ResponseEntity.status(200).body(limiteService.buscarTodos());
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Limite buscarPorId(@PathVariable Long id) {
        return limiteService.buscarPorId(id);
    }

    @PostMapping
    public Limite salvar(@RequestBody @Valid Limite limite) {
        return limiteService.salvar(limite);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        limiteService.deletar(buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Limite> atualizar(@PathVariable Long id, @RequestBody Limite limite) {
        try {
            limite.setId(id);
            return ResponseEntity.status(200).body(limiteService.atualizar(limite));
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

}
