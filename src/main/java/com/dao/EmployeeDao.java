package com.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Request;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	Employee findByUsername(String username);

	//Employee findByDept(String department);

	//Employee findByLoc(String address);


	Employee findByAddress(String address);

	//Employee findByDepartment(String department);

	Employee findByEmail(String email);

	Employee findAllByDepartment(String department);




	//Employee findByDate(Date date);

//	 public List<Request> findByDept(String department);
//
//	public List<Request> findByLoc(String address);

//	public List<Employee> findByDept(String department);
//
//	public List<Employee> findByLoc(String address);
	
	
	

	//Optional<Employee> findById(String dept);

	//public List<Request> findbydeptId(String dept);

	//Request findByDept(String dept);
//
//	Request findByDept(String dept);
//
//	List<Employee> filterTodosByEmployeeId(Employee employee);

	//List<Employee> filterTodosByEmployeeId(Employee employee);


	//List<Request> filterTodosByEmployeeId(Request request);

	//List<Employee> filterTodosByEmployeeId(Employee employee);

}
