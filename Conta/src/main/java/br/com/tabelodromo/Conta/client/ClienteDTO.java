package br.com.tabelodromo.Conta.client;

import br.com.tabelodromo.Conta.enums.TipoDePessoa;
import java.math.BigDecimal;

public class ClienteDTO {

    private Long id;

    private String nome;

    private TipoDePessoa tipoDePessoa;

    private BigDecimal RendaMensal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDePessoa getTipoDePessoa() {
        return tipoDePessoa;
    }

    public void setTipoDePessoa(TipoDePessoa tipoDePessoa) {
        this.tipoDePessoa = tipoDePessoa;
    }

    public BigDecimal getRendaMensal() {
        return RendaMensal;
    }

    public void setRendaMensal(BigDecimal rendaMensal) {
        RendaMensal = rendaMensal;
    }
}
