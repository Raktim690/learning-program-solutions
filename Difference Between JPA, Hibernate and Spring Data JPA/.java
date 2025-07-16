// Interface (JPA)
public interface EntityManager {
    void persist(Object obj);
}

// Hibernate implements this
EntityManager em = ...;
em.persist(new Student("John", "EEE"));

// Spring Data JPA auto-generates this:
interface StudentRepository extends JpaRepository<Student, Long> {}
