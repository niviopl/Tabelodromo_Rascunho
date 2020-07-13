package br.com.tabelodromo.Conta.services;

import br.com.tabelodromo.Conta.client.ClienteClient;
import br.com.tabelodromo.Conta.client.ClienteDTO;
import br.com.tabelodromo.Conta.enums.TipoDePessoa;
import br.com.tabelodromo.Conta.enums.TipoDeSegmento;
import br.com.tabelodromo.Conta.exceptions.ContaNotFoundException;
import br.com.tabelodromo.Conta.models.Conta;
import br.com.tabelodromo.Conta.repositories.ContaRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ContaService {


    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private ClienteClient clienteClient;

    public Conta create(Conta conta) {

        try {
            BigDecimal rendaMensal;
            ClienteDTO clienteDTO = clienteClient.getById(conta.getClienteId());
            rendaMensal = clienteDTO.getRendaMensal();

            if (rendaMensal.intValue() < 5000){
                conta.setTipoDeSegmento(TipoDeSegmento.VAREJO);
            }

            if (rendaMensal.intValue() >= 5000 && rendaMensal.intValue() < 10000 ){
                conta.setTipoDeSegmento(TipoDeSegmento.UNICLASS);
            }

            if (rendaMensal.intValue() >= 10000 && rendaMensal.intValue() < 50000 ){
                conta.setTipoDeSegmento(TipoDeSegmento.PERSONNALITE);
            }

            if (rendaMensal.intValue() >= 50000){
                conta.setTipoDeSegmento(TipoDeSegmento.PRIVATE);
            }

            if (clienteDTO.getTipoDePessoa() == TipoDePessoa.JURIDICA){
                conta.setTipoDeSegmento(TipoDeSegmento.EMP1);
            }

            return contaRepository.save(conta);
        } catch (FeignException.NotFound e) {
            throw new ContaNotFoundException();
        }
    }

    public Conta getById(Long id) {
        Optional<Conta> byId = contaRepository.findById(id);
        if(!byId.isPresent()) {
            throw new ContaNotFoundException();
        }
        return byId.get();
    }



}
