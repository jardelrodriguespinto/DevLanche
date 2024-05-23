package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Cargo;
import br.com.dev.lanche.teste.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface ContatoRepository extends JpaRepository<Contato, UUID>
{
    @Query(nativeQuery = true, value = "SELECT contato FROM contato WHERE tipo = :tipo AND numero = :numero")
    Optional<Contato> findByTipoAndNumero(@Param("tipo") String tipo,
                                          @Param("numero") String numero);
}
