package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private EmployeeDemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Demo start");

        Employee e1 = new Employee("Alice (Hibernate)", 50000.0);
        Integer id1 = demoService.saveWithHibernate(e1);
        System.out.println("Saved by manual Hibernate, id = " + id1);

        Employee e2 = new Employee("Bob (Spring Data JPA)", 60000.0);
        Employee savedE2 = demoService.saveWithSpringData(e2);
        System.out.println("Saved by Spring Data JPA, id = " + savedE2.getId());

        System.out.println("Demo end");
    }
}

