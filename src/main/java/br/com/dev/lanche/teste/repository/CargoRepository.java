package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, String> {
}
