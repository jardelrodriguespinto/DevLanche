package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, UUID>
{
}
