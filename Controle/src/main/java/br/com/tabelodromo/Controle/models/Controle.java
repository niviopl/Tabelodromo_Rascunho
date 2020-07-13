package br.com.tabelodromo.Controle.models;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Controle {

    private String agencia;

    private String conta;

    private String dac;

    private Long idLimite;

    private Date dataMovimento;

    private Date dataCorteSemana;

    private BigDecimal limiteDiarioConsumido;

    private BigDecimal limiteSemanalConsumido;

    public Controle() {
    }

    public Controle(String agencia, String conta, String dac, Long idLimite, Date dataMovimento, Date dataCorteSemana, BigDecimal limiteDiarioConsumido, BigDecimal limiteSemanalConsumido) {
        this.agencia = agencia;
        this.conta = conta;
        this.dac = dac;
        this.idLimite = idLimite;
        this.dataMovimento = dataMovimento;
        this.dataCorteSemana = dataCorteSemana;
        this.limiteDiarioConsumido = limiteDiarioConsumido;
        this.limiteSemanalConsumido = limiteSemanalConsumido;
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

    public Long getIdLimite() {
        return idLimite;
    }

    public void setIdLimite(Long idLimite) {
        this.idLimite = idLimite;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Date getDataCorteSemana() {
        return dataCorteSemana;
    }

    public void setDataCorteSemana(Date dataCorteSemana) {
        this.dataCorteSemana = dataCorteSemana;
    }

    public BigDecimal getLimiteDiarioConsumido() {
        return limiteDiarioConsumido;
    }

    public void setLimiteDiarioConsumido(BigDecimal limiteDiarioConsumido) {
        this.limiteDiarioConsumido = limiteDiarioConsumido;
    }

    public BigDecimal getLimiteSemanalConsumido() {
        return limiteSemanalConsumido;
    }

    public void setLimiteSemanalConsumido(BigDecimal limiteSemanalConsumido) {
        this.limiteSemanalConsumido = limiteSemanalConsumido;
    }
}
