package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Celular;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CelularRepository extends JpaRepository<Celular, String> {
}
