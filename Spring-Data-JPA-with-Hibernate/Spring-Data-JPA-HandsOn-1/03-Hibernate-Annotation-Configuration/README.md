# Hands-on 3 - Hibernate Annotation Configuration

## Objective

To understand Hibernate Annotation Configuration and how annotations are used to map Java objects to relational database tables.

## Topics Covered

### 1. Object-Relational Mapping (ORM)

Hibernate uses annotations in the persistence class to map Java objects to database tables. This approach eliminates the need for separate XML mapping files and makes the code easier to maintain.

**Example:**

```java
@Entity
@Table(name = "employee")
public class Employee {
}
```

---

### 2. @Entity

- Marks a Java class as a persistent entity.
- Indicates that the class is mapped to a database table.

**Example:**

```java
@Entity
public class Employee {
}
```

---

### 3. @Table

- Specifies the database table associated with the entity.

**Example:**

```java
@Entity
@Table(name = "employee")
public class Employee {
}
```

---

### 4. @Id

- Identifies the primary key of the entity.
- Every entity must have a primary key.

**Example:**

```java
@Id
private int id;
```

---

### 5. @GeneratedValue

- Automatically generates values for the primary key.
- Commonly used with auto-increment columns.

**Example:**

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
```

---

### 6. @Column

- Maps a class field to a database column.
- Allows customization of the column name.

**Example:**

```java
@Column(name = "employee_name")
private String name;
```

---

### 7. Hibernate Configuration (hibernate.cfg.xml)

The `hibernate.cfg.xml` file contains the configuration required to connect the application to the database.

#### Dialect

Specifies the SQL dialect used by the database.

```xml
<property name="hibernate.dialect">
    org.hibernate.dialect.MySQLDialect
</property>
```

#### Driver

Specifies the JDBC driver class.

```xml
<property name="connection.driver_class">
    com.mysql.cj.jdbc.Driver
</property>
```

#### Connection URL

Specifies the database connection URL.

```xml
<property name="connection.url">
    jdbc:mysql://localhost:3306/test
</property>
```

#### Username

Specifies the database username.

```xml
<property name="connection.username">
    root
</property>
```

#### Password

Specifies the database password.

```xml
<property name="connection.password">
    root
</property>
```

---

## Learning Outcomes

After completing this hands-on, you will be able to:

- Understand Hibernate Annotation Configuration.
- Map Java classes to database tables using annotations.
- Configure Hibernate using `hibernate.cfg.xml`.
- Understand the purpose of `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, and `@Column`.
- Configure database connectivity using Hibernate.