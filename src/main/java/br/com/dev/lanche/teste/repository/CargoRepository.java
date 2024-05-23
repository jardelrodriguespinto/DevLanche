package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, UUID>
{
    @Query(nativeQuery = true, value = "SELECT cargo FROM cargo WHERE descricao = :descricao")
    Optional<Cargo> findByDescricao(@Param("descricao") String descricao);
}
