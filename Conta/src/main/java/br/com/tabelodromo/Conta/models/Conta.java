package br.com.tabelodromo.Conta.models;

import br.com.tabelodromo.Conta.enums.TipoDeSegmento;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Conta {

    private String agencia;

    private String conta;

    private String dac;

    private TipoDeSegmento tipoDeSegmento;

    private BigDecimal saldo;

    private Long clienteId;

    public Conta() {
    }

    public Conta(String agencia, String conta, String dac, TipoDeSegmento tipoDeSegmento, BigDecimal saldo, Long clienteId) {
        this.agencia = agencia;
        this.conta = conta;
        this.dac = dac;
        this.tipoDeSegmento = tipoDeSegmento;
        this.saldo = saldo;
        this.clienteId = clienteId;
    }

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

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
}
