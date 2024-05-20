package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
