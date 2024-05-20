package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, String> {
}
