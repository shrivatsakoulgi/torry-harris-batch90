package com.torryharris.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.torryharris.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void insertEmployee(Employee employee) {
		
		entityManager.persist(employee);

	}

	public List<Employee> getAllEmployees() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> cq= builder.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		cq.select(root);	
		return entityManager.createQuery(cq).getResultList();
	}

}
