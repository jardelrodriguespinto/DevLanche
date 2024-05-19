package br.com.dev.lanche.teste.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {
    private String name;
    private String description;
    private BigDecimal preco;
    private String categoria;
    private String estoque;
    private String imagem;
}
