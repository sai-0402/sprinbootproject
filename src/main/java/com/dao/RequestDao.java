package com.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;

import com.model.Request;

public interface RequestDao extends JpaRepository<Request,Integer> {

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
