package br.com.dev.lanche.teste.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente extends BaseEntity {
    private String nome;
    @OneToOne
    private Email email;
    @OneToMany
    private Set<Celular> celulares;
    @OneToOne
    private Telefone telefone;
    @Embedded
    private Endereco endereco;

    public void addCelulares(Celular celular){
        if (celulares == null)
            celulares = new HashSet<>();

        celulares.add(celular);
    }
}
