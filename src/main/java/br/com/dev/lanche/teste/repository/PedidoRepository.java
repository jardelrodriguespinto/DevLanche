package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, String> {
}
