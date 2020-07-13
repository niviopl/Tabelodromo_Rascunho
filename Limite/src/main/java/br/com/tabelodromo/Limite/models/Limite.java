package br.com.tabelodromo.Limite.models;

import br.com.tabelodromo.Limite.enums.TipoDeAutenticacao;
import br.com.tabelodromo.Limite.enums.TipoDeCanal;
import br.com.tabelodromo.Limite.enums.TipoDeOperacao;
import br.com.tabelodromo.Limite.enums.TipoDeSegmento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Limite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O Tipo de Segmento não pode ser nulo ou vazio!")
    private TipoDeSegmento tipoDeSegmento;

    @NotBlank(message = "O Tipo de Canal não pode ser nulo ou vazio!")
    private TipoDeCanal tipoDeCanal;

    @NotBlank(message = "O Tipo de Operação não pode ser nulo ou vazio!")
    private TipoDeOperacao tipoDeOperacao;

    @NotBlank(message = "O Tipo de Autenticação não pode ser nulo ou vazio!")
    private TipoDeAutenticacao tipoDeAutenticacao;

    @NotNull(message = "O Limite Diário não pode ser nulo!")
    private BigDecimal limiteDiario;

    @NotNull(message = "O Limite Semanal não pode ser nulo!")
    private BigDecimal limiteSemanal;

    public Limite() {
    }

    public Limite(Long id, @NotBlank(message = "O Tipo de Segmento não pode ser nulo ou vazio!") TipoDeSegmento tipoDeSegmento, @NotBlank(message = "O Tipo de Canal não pode ser nulo ou vazio!") TipoDeCanal tipoDeCanal, @NotBlank(message = "O Tipo de Operação não pode ser nulo ou vazio!") TipoDeOperacao tipoDeOperacao, @NotBlank(message = "O Tipo de Autenticação não pode ser nulo ou vazio!") TipoDeAutenticacao tipoDeAutenticacao, @NotNull(message = "O Limite Diário não pode ser nulo!") BigDecimal limiteDiario, @NotNull(message = "O Limite Semanal não pode ser nulo!") BigDecimal limiteSemanal) {
        this.id = id;
        this.tipoDeSegmento = tipoDeSegmento;
        this.tipoDeCanal = tipoDeCanal;
        this.tipoDeOperacao = tipoDeOperacao;
        this.tipoDeAutenticacao = tipoDeAutenticacao;
        this.limiteDiario = limiteDiario;
        this.limiteSemanal = limiteSemanal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(BigDecimal limiteDiario) {
        this.limiteDiario = limiteDiario;
    }

    public BigDecimal getLimiteSemanal() {
        return limiteSemanal;
    }

    public void setLimiteSemanal(BigDecimal limiteSemanal) {
        this.limiteSemanal = limiteSemanal;
    }
}
