package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {
}
