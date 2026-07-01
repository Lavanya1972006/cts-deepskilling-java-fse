package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int id;

    private String name;

    private String email;

    private double salary;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


    @ManyToMany
    @JoinTable(
            name = "employee_skill",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private List<Skill> skills;


    public Employee() {
    }


    public Employee(int id, String name, String email, double salary,
                    Department department, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }


    public List<Skill> getSkills() {
        return skills;
    }


    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}