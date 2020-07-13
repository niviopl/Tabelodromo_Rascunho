package br.com.tabelodromo.Conta.models.mapper;

import br.com.tabelodromo.Conta.client.ClienteClient;
import br.com.tabelodromo.Conta.client.ClienteDTO;
import br.com.tabelodromo.Conta.models.Conta;
import br.com.tabelodromo.Conta.models.dto.GetContaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContaMapper {


    @Autowired
    private ClienteClient clienteClient;

    public GetContaResponse toGetResponse(Conta conta) {
        ClienteDTO clienteDTO = clienteClient.getById(conta.getClienteId());

        GetContaResponse getContaResponse = new GetContaResponse();
        getContaResponse.setAgencia(conta.getAgencia());
        getContaResponse.setConta(conta.getConta());
        getContaResponse.setDac(conta.getDac());
        getContaResponse.setSaldo(conta.getSaldo());
        getContaResponse.setTipoDeSegmento(conta.getTipoDeSegmento());
        return getContaResponse;
    }

}
