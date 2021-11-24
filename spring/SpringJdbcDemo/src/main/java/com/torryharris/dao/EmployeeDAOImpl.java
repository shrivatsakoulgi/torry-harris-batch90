package com.torryharris.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.torryharris.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {	
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void save(Employee employee) {	
		String query = "insert into employee values (?,?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=dataSource.getConnection();
			ps=con.prepareStatement(query);
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getDesignation());
			ps.setInt(4, employee.getSalary());		
			ps.execute();
			System.out.println("Employee Saved in DB...");
			System.out.println(employee);		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}	
	}

	public Employee getById(int empId) {
		Connection con=null;
		Statement stat=null;
		try {
			con=dataSource.getConnection();
			stat=con.createStatement();
			String query = "select * from employee where empid="+empId;
			ResultSet rs = stat.executeQuery(query);
				while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String designation = rs.getString(3);
					int salary = rs.getInt(4);
					
					return new Employee(id, name, designation, salary);
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void update(Employee employee) {
		String query = "update employee set name=?, designation=?, salary =?"
				+ " where empid=?";
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=dataSource.getConnection();
			ps=con.prepareStatement(query);
			
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getDesignation());
			ps.setInt(3, employee.getSalary());
			ps.setInt(4, employee.getEmpId());
			
			int res = ps.executeUpdate();
			if(res!=0) {
				System.out.println("Employee updated with id:"+employee.getEmpId());
				System.out.println(employee);
			} else {
				System.out.println("Employee with id : "+employee.getEmpId()+" NOT FOUND !!");
			}
			
					
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}	
		
	}

	public void deleteById(int empId) {
		String query = "delete from employee where empid="+empId;
		Connection con=null;
		Statement stat=null;
		try {
			con=dataSource.getConnection();
			stat=con.createStatement();
			int res = stat.executeUpdate(query);
			if(res!=0) {
				System.out.println("Employee deleted with id:"+empId);
			}else {
				System.out.println("Employee with id:"+empId+" is not Found!!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Employee> getAllEmployees() {
		Connection con=null;
		Statement stat=null;
		ArrayList<Employee> empList = new ArrayList<Employee>();
		try {
			con=dataSource.getConnection();
			stat=con.createStatement();
			String query = "select * from employee";
			ResultSet rs = stat.executeQuery(query);
				while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String designation = rs.getString(3);
					int salary = rs.getInt(4);
					
					 empList.add(new Employee(id, name, designation, salary));
				}	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

}
