package br.com.dev.lanche.teste.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Fornecedor extends BaseEntity
{
    private String nome;
    private String email;
    private String telefone;
    @Embedded
    private Endereco endereco;
    @ManyToMany
    @JoinTable(
            name = "fornecedor_compra",
            joinColumns = @JoinColumn(name = "fornecedor_id"),
            inverseJoinColumns = @JoinColumn(name = "compra_id"))
    private Set<Compra> compras = new HashSet<>();
}
