# Hands-on 2 - Hibernate XML Configuration

## Objective

To understand Hibernate XML Configuration and the core components used for performing database operations using Hibernate ORM.

## Topics Covered

### 1. Object-Relational Mapping (ORM)

Hibernate maps Java objects to relational database tables using XML mapping files.

**Example:**
- Java Class: `Employee.java`
- XML Mapping File: `Employee.hbm.xml`
- Database Table: `EMPLOYEE`

The XML mapping file defines:
- Class name
- Table name
- Primary key
- Column mapping

---

### 2. SessionFactory

- Created only once during application startup.
- Reads the `hibernate.cfg.xml` configuration file.
- Creates `Session` objects.
- A heavyweight object shared across the application.

**Example:**

```java
SessionFactory factory = new Configuration()
        .configure()
        .buildSessionFactory();
```

---

### 3. Session

- Represents a connection between the application and the database.
- Used to perform CRUD operations.
- Created from the `SessionFactory`.

**Example:**

```java
Session session = factory.openSession();
```

---

### 4. Transaction

- Ensures database operations are executed successfully.
- Allows changes to be committed or rolled back.

**Example:**

```java
Transaction tx = session.beginTransaction();
```

---

### 5. beginTransaction()

Starts a new database transaction.

**Example:**

```java
Transaction tx = session.beginTransaction();
```

---

### 6. commit()

Permanently saves all changes to the database.

**Example:**

```java
tx.commit();
```

---

### 7. rollback()

Cancels the transaction if an error occurs.

**Example:**

```java
tx.rollback();
```

---

### 8. session.save()

Stores a new object in the database.

**Example:**

```java
session.save(employee);
```

---

### 9. session.createQuery().list()

Retrieves all records from the database.

**Example:**

```java
List<Employee> employees =
        session.createQuery("FROM Employee").list();
```

---

### 10. session.get()

Retrieves a single object using its primary key.

**Example:**

```java
Employee employee = session.get(Employee.class, 1);
```

---

### 11. session.delete()

Deletes an existing object from the database.

**Example:**

```java
session.delete(employee);
```