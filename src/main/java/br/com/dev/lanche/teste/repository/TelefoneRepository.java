package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, String> {
}
