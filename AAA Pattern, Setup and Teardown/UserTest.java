package com.cognizant.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User("Raktim");
        System.out.println("Setting up before each test.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test.");
    }

    @Test
    void testUserName() {
        // Arrange-Act-Assert
        String name = user.getName();
        assertEquals("Raktim", name);
    }
}
