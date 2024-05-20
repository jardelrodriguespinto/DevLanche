package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, String> {
}
