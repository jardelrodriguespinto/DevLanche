package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, String> {
}
