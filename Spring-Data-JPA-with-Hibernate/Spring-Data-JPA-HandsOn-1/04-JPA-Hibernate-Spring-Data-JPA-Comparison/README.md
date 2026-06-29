# Hands-on 4 - Difference Between JPA, Hibernate, and Spring Data JPA

## Objective

To understand the differences between Java Persistence API (JPA), Hibernate, and Spring Data JPA, along with their roles in developing Java applications that interact with relational databases.

## Java Persistence API (JPA)

- JPA (Java Persistence API) is a specification (JSR 338) for persisting, reading, and managing data from Java objects.
- It defines a standard set of interfaces for Object-Relational Mapping (ORM).
- JPA does not provide a concrete implementation.
- Hibernate is one of the most popular implementations of JPA.

---

## Hibernate

- Hibernate is an Object-Relational Mapping (ORM) framework.
- It implements the JPA specification.
- Hibernate maps Java objects to relational database tables.
- It provides features such as caching, transaction management, lazy loading, and database independence.

---

## Spring Data JPA

- Spring Data JPA is built on top of JPA.
- It does not implement JPA itself but works with JPA providers such as Hibernate.
- It reduces boilerplate code by providing built-in repository interfaces.
- It simplifies CRUD operations and automatically manages transactions.

---

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|---------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Abstraction over JPA |
| Implementation | No | Yes | No |
| ORM Support | Defines Standards | Implements JPA | Uses JPA Providers |
| Boilerplate Code | More | Moderate | Minimal |
| Transaction Management | Supported | Supported | Automatically Managed |
| CRUD Operations | Manual | Manual | Simplified using Repository Interfaces |

---

## Hibernate Example

```java
/* Method to CREATE an employee in the database */
public Integer addEmployee(Employee employee) {
    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;

    try {
        tx = session.beginTransaction();
        employeeID = (Integer) session.save(employee);
        tx.commit();
    } catch (HibernateException e) {
        if (tx != null)
            tx.rollback();
        e.printStackTrace();
    } finally {
        session.close();
    }

    return employeeID;
}
```

---

## Spring Data JPA Example

### EmployeeRepository.java

```java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
```

### EmployeeService.java

```java
@Autowired
private EmployeeRepository employeeRepository;

@Transactional
public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
}
```

---

## Conclusion

JPA defines the standard for persistence, Hibernate provides the implementation of that standard, and Spring Data JPA further simplifies database access by reducing boilerplate code through repository interfaces and automatic transaction management.