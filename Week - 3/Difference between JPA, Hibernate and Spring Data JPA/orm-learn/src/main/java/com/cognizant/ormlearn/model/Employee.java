package com.cognizant.ormlearn.model;

import jakarta.persistence.*; // or javax.persistence.* depending on your setup

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double salary;

    public Employee() {}
    public Employee(String name, Double salary) { this.name = name; this.salary = salary; }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }

    @Override
    public String toString() { return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}'; }
}
