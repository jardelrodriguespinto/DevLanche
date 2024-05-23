package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Cargo;
import br.com.dev.lanche.teste.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, UUID>
{
    @Query(nativeQuery = true, value = "SELECT categoria FROM categoria WHERE descricao = :descricao")
    Optional<Categoria> findByDescricao(@Param("descricao") String descricao);
}
