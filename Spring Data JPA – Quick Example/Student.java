package com.example.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;

    public Student() {}
    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters & Setters
}
