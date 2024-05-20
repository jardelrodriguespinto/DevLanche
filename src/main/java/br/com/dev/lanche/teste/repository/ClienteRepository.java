package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
