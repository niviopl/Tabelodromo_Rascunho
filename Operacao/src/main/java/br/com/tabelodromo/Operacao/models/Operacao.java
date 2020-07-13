package br.com.tabelodromo.Operacao.models;

import br.com.tabelodromo.Operacao.enums.TipoDeAutenticacao;
import br.com.tabelodromo.Operacao.enums.TipoDeCanal;
import br.com.tabelodromo.Operacao.enums.TipoDeOperacao;
import br.com.tabelodromo.Operacao.enums.TipoDeSegmento;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Operacao {
    private String agencia;

    private String conta;

    private String dac;

    private TipoDeSegmento tipoDeSegmento;

    private TipoDeCanal tipoDeCanal;

    private TipoDeOperacao tipoDeOperacao;

    private TipoDeAutenticacao tipoDeAutenticacao;

    private BigDecimal valorOperacao;

    private String statusOperacao;      //Aprovada (SIM/NAO)

    public Operacao() {
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

    public TipoDeCanal getTipoDeCanal() {
        return tipoDeCanal;
    }

    public void setTipoDeCanal(TipoDeCanal tipoDeCanal) {
        this.tipoDeCanal = tipoDeCanal;
    }

    public TipoDeOperacao getTipoDeOperacao() {
        return tipoDeOperacao;
    }

    public void setTipoDeOperacao(TipoDeOperacao tipoDeOperacao) {
        this.tipoDeOperacao = tipoDeOperacao;
    }

    public TipoDeAutenticacao getTipoDeAutenticacao() {
        return tipoDeAutenticacao;
    }

    public void setTipoDeAutenticacao(TipoDeAutenticacao tipoDeAutenticacao) {
        this.tipoDeAutenticacao = tipoDeAutenticacao;
    }

    public BigDecimal getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(BigDecimal valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public String getStatusOperacao() {
        return statusOperacao;
    }

    public void setStatusOperacao(String statusOperacao) {
        this.statusOperacao = statusOperacao;
    }
}
