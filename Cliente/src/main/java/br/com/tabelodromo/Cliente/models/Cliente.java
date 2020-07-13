package br.com.tabelodromo.Cliente.models;

import br.com.tabelodromo.Cliente.enums.TipoDePessoa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O Nome do Cliente não pode ser nulo ou vazio!")
    private String nome;

    @NotBlank(message = "O Tipo de Pessoa não pode ser nulo ou vazio!")
    private TipoDePessoa tipoDePessoa;

    @NotBlank(message = "O E-Mail do Cliente não pode ser nulo ou vazio!")
    private String  email;

    @NotBlank(message = "O CPF/CNPJ do Cliente não pode ser nulo ou vazio!")
    private String  CPF_CNPJ;

    @NotNull(message = "A Renda Mensa do Cliente não pode ser nula!")
    private BigDecimal RendaMensal;

    public Cliente(Long id, @NotBlank(message = "O Nome do Cliente não pode ser nulo ou vazio!") String nome, @NotBlank(message = "O Tipo de Pessoa não pode ser nulo ou vazio!") TipoDePessoa tipoDePessoa, @NotBlank(message = "O E-Mail do Cliente não pode ser nulo ou vazio!") String email, @NotBlank(message = "O CPF/CNPJ do Cliente não pode ser nulo ou vazio!") String CPF_CNPJ, @NotNull(message = "A Renda Mensa do Cliente não pode ser nula!") BigDecimal rendaMensal) {
        this.id = id;
        this.nome = nome;
        this.tipoDePessoa = tipoDePessoa;
        this.email = email;
        this.CPF_CNPJ = CPF_CNPJ;
        RendaMensal = rendaMensal;
    }

    public Cliente() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public BigDecimal getRendaMensal() {
        return RendaMensal;
    }

    public void setRendaMensal(BigDecimal rendaMensal) {
        RendaMensal = rendaMensal;
    }
}


