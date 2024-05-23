package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Cargo;
import br.com.dev.lanche.teste.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID>
{
    @Query(nativeQuery = true, value = "SELECT cliente FROM cliente" +
                                        " WHERE nome = :nome AND sobrenome = :sobrenome")
    Optional<Cliente> findByNomeCompleto(@Param("nome") String nome,
                                         @Param("sobrenome") String sobrenome);

}
