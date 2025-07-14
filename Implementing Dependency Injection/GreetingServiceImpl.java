package com.example;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hello using Dependency Injection!";
    }
}
