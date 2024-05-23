package br.com.dev.lanche.teste.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contato extends BaseEntity
{
    private String tipo;
    private String numero;
}
