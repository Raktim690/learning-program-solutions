package com.cognizant.springlearn.web;

import com.cognizant.springlearn.security.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
    private final JwtUtil jwtUtil;

    public AuthenticationController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader(value = "Authorization", required = false) String authHeader) {
        LOGGER.info("authenticate START");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            LOGGER.warn("Missing or invalid Authorization header");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "Missing Authorization header"));
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        String credentials;
        try {
            credentials = new String(Base64.getDecoder().decode(base64Credentials), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException ex) {
            LOGGER.warn("Failed to decode Basic credentials", ex);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "Invalid Authorization header"));
        }

        String[] parts = credentials.split(":", 2);
        if (parts.length != 2) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "Invalid credential format"));
        }

        String username = parts[0];
        String password = parts[1];

        if (!"user".equals(username) || !"pwd".equals(password)) {
            LOGGER.info("Invalid credentials for user: {}", username);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", "Invalid credentials"));
        }

        String token = jwtUtil.generateToken(username);

        LOGGER.info("authenticate END");
        return ResponseEntity.ok(Map.of("token", token));
    }
}
