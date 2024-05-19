package br.com.dev.lanche.teste.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String logradouro;
    private Integer numero;
    private Integer complemento;
    private String bairro;
    private String estado;
    private String cep;

}

