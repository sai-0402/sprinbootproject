package com.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Request;
@Repository
public interface RequestDao extends JpaRepository<Request,Integer> {

	List<Request> findByDate(java.sql.Date date);

	//List<Request> findByDepartment(String department);


	//List<Request> findByDepartment(String department);

	//List<Request> findByDateBetween(Date start, Date end);
	
//	public List<Request> findByDept(String department);
//
//	public List<Request> findByLoc(String address);
	//List<Request> findById(Request empId);

	//Object findByDate(java.sql.Date date);

	//Object findByDateBetween(java.sql.Date date, java.sql.Date date2);

	//List<Request> findByDateBetween(Date start, Date end);


	//Optional<Request> findById(Employee empId);

	//List<Request> filterTodosByUserId(Request request);
//	public Request getdept(String dept);
//
//	public Request findByDept(String dept);

//	List<Request> filterTodosByDept(Request request);
//
//	List<Request> filterTodosByDate(Request request);
//	
//	public default List<Request> findProductWithSorting(Date date)
//	{
//	return rdao.findAll(Sort.by(Sort.Direction.ASC,date));
//	}
//
	
	
	

	//Streamable<Order> findByDept(String dept);

	//List<Request> filterTodosByUserId(Request request);

//	//List<Request> filterTodosByUserId(Request request);
//
//	List<Request> getAllRequests(Integer pageNo, Integer pageSize, String sortBy);
//
//
//	List<Request> filterTodosByEmployeeId(Request request);
//
//	List<Request> filterTodosByDept(Request request);
//
//	List<Request> filterTodosByDate(Request request);
//
//	List<Request> filterTodosByUserId(Request request);

}
