package br.com.dev.lanche.teste.repository;

import br.com.dev.lanche.teste.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String>{
    UserDetails findByLogin(String login);
}
