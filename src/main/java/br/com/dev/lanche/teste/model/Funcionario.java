package br.com.dev.lanche.teste.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Funcionario extends BaseEntity
{
    private String nome;
    private Integer idade;
    private Cargo cargo;
    private Timestamp admissao;
    private Timestamp demissao;
    private Boolean isAtivo;
}
