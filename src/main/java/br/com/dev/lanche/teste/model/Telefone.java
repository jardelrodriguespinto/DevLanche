package br.com.dev.lanche.teste.model;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Telefone  extends BaseEntity{
    private String telefone;
}
