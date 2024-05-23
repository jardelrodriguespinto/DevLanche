package br.com.dev.lanche.teste.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Cliente extends BaseEntity {
    private String nome;
    private String sobrenome;
    @OneToOne
    private Email email;
    @OneToMany
    private Set<Contato> contatos;
    @Embedded
    private Endereco endereco;

    public void addContatos(Contato contato)
    {
        if (contatos == null)
            contatos = new HashSet<>();

        contatos.add(contato);
    }
}
