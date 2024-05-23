package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, UUID>
{
}
