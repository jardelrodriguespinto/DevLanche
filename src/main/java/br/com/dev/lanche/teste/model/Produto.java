package br.com.dev.lanche.teste.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produto extends BaseEntity {
    private String nome;
    private String descricao;
    private BigDecimal preco;
    @ManyToOne
    private Categoria categoria;
    private Long quantidade;
    private String imagem;
}