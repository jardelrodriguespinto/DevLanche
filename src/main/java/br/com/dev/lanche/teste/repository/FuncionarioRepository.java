package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {
}
