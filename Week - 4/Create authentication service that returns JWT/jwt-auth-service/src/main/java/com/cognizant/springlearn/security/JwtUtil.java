package com.cognizant.springlearn.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class JwtUtil {
    private static final String SECRET = "replace_with_a_really_long_secret_32_plus_chars";
    private static final long EXPIRATION_MS = 10 * 60 * 1000; 

    private final Algorithm algorithm;

    public JwtUtil() {
        algorithm = Algorithm.HMAC256(SECRET.getBytes(StandardCharsets.UTF_8));
    }

    public String generateToken(String username) {
        Date now = new Date();
        Date exp = new Date(now.getTime() + EXPIRATION_MS);

        return JWT.create()
                .withSubject(username)
                .withIssuedAt(now)
                .withExpiresAt(exp)
                .sign(algorithm);
    }
}
