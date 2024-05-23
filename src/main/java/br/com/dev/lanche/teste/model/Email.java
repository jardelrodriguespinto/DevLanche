package br.com.dev.lanche.teste.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Email extends BaseEntity
{
    private String email;
}
