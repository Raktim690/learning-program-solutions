package com.example.springwebmaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Spring Web Project using Maven!";
    }
}
