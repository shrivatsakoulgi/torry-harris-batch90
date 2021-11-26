package com.torryharris.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		
		return null;
	}

}
