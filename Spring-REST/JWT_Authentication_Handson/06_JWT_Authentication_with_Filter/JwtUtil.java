package com.cognizant.springlearn.security;

import java.nio.charset.StandardCharsets;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;


@Component
public class JwtUtil {


    private static final String SECRET =
            "secretkeysecretkeysecretkey12345";


    private final SecretKey key =
            Keys.hmacShaKeyFor(
                    SECRET.getBytes(StandardCharsets.UTF_8));


    public String extractUsername(String token) {

        return extractClaims(token)
                .getSubject();
    }


    public boolean validateToken(String token) {

        try {

            extractClaims(token);

            return true;

        } catch(Exception e) {

            return false;
        }
    }


    private Claims extractClaims(String token) {

        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}