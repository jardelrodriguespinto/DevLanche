package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, String> {
}
