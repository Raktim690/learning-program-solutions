package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManagerFactory; // or javax.persistence
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeDemoService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public Integer saveWithHibernate(Employee e) {
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Integer generatedId = null;
        try {
            tx = session.beginTransaction();
            generatedId = (Integer) session.save(e); // manual save
            tx.commit();
        } catch (RuntimeException ex) {
            if (tx != null) tx.rollback();
            throw ex;
        } finally {
            session.close();
        }
        return generatedId;
    }

    @Transactional
    public Employee saveWithSpringData(Employee e) {
        return employeeRepository.save(e);
    }
}
