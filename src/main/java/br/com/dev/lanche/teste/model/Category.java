package br.com.dev.lanche.teste.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class Category extends BaseEntity {
    private String name;
    private String description;
}
