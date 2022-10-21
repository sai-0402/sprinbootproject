package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Employee;
import com.model.Request;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	Employee findByUsername(String username);

	//Request findByDept(String dept);
//
//	Request findByDept(String dept);
//
//	List<Employee> filterTodosByEmployeeId(Employee employee);

	//List<Employee> filterTodosByEmployeeId(Employee employee);


	//List<Request> filterTodosByEmployeeId(Request request);

	//List<Employee> filterTodosByEmployeeId(Employee employee);

}
