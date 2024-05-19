package br.com.dev.lanche.teste.service;

import br.com.dev.lanche.teste.user.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {
    @Value("${api.security.token.secret}")
    private String secret;

    public String generateToken(User user){
        try {

            Algorithm algorithm = Algorithm.HMAC256(secret);
            String token = JWT.create()
                              .withIssuer("auth-api")
                              .withSubject(user.getLogin())
                              .withExpiresAt(genExpirationDate())
                              .sign(algorithm);

            return token;

        } catch (JWTCreationException e) {
            throw new RuntimeException("Error while generation JWT Token: " + e);
        }
    }

    public String validateToken(String token){
        String teste = null;
        try {

            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWT.require(algorithm)
               .withIssuer("auth-api")
               .build().verify(token)
               .getSubject();

        } catch (JWTVerificationException e) {
            teste = "";
        }
        return teste;
    }


    public Instant genExpirationDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }


}
