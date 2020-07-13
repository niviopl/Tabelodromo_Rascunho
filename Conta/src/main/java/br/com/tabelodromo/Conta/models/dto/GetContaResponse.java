package br.com.tabelodromo.Conta.models.dto;

import br.com.tabelodromo.Conta.client.ClienteDTO;
import br.com.tabelodromo.Conta.enums.TipoDeSegmento;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class GetContaResponse {

    private String agencia;

    private String conta;

    private String dac;

    private TipoDeSegmento tipoDeSegmento;

    private BigDecimal saldo;

    @JsonProperty("cliente")
    private ClienteDTO clienteDTO;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac;
    }

    public TipoDeSegmento getTipoDeSegmento() {
        return tipoDeSegmento;
    }

    public void setTipoDeSegmento(TipoDeSegmento tipoDeSegmento) {
        this.tipoDeSegmento = tipoDeSegmento;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }
}
