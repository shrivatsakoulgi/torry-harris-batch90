package com.torryharris.springbootdemoweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.torryharris.springbootdemoweb.model.Employee;

@Repository
public interface EmployeeRepository extends 
CrudRepository<Employee, Integer>{

}
