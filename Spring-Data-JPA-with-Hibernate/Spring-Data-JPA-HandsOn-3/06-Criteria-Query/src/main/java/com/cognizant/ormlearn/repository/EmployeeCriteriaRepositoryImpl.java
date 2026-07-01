package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeCriteriaRepositoryImpl implements EmployeeCriteriaRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Employee> findEmployeeByCriteria(String name, Double salary) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> criteriaQuery =
                criteriaBuilder.createQuery(Employee.class);

        Root<Employee> employeeRoot =
                criteriaQuery.from(Employee.class);


        List<Predicate> predicates = new ArrayList<>();


        if (name != null && !name.isEmpty()) {
            predicates.add(
                    criteriaBuilder.like(
                            employeeRoot.get("name"),
                            "%" + name + "%"
                    )
            );
        }


        if (salary != null) {
            predicates.add(
                    criteriaBuilder.greaterThanOrEqualTo(
                            employeeRoot.get("salary"),
                            salary
                    )
            );
        }


        criteriaQuery.where(
                criteriaBuilder.and(
                        predicates.toArray(new Predicate[0])
                )
        );


        TypedQuery<Employee> query =
                entityManager.createQuery(criteriaQuery);


        return query.getResultList();
    }

}