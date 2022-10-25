package com.controller;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AdminDao;
import com.dao.EmployeeDao;
import com.dao.RequestDao;
import com.model.Employee;
import com.model.Request;
import com.model.User;
@RestController
public class AdminController {
  @Autowired 
  AdminDao adao;
  @Autowired 
  RequestDao rdao;
  @Autowired 
  EmployeeDao edao;
     
//  @GetMapping("/filterbydate")
//  List<Request> findByDate() throws ParseException
//  {
//	  Date start = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-01");
//	  Date end = new SimpleDateFormat("yyyy-MM-dd").parse("2022-10-25");
//	  List<Request> req = rdao.findByDateBetween(start,end);
//	  System.out.println("findBydate"+req);
//	  return req;
//  }
//  @GetMapping("/getempId/{empId}")
//  public List<Request> getmail(@PathVariable int empId)
//  {   
//	  List<Request> request =edao.findById(empId).get().getRequest();
//	  return request;
//  }
  @GetMapping("/getbydate/{date}")
  public List<Request> getdate(@PathVariable LocalDate date)
  {
	  List<Request> request = rdao.findByDate(date);
	  return request;
  }
  @GetMapping("/getdept/{department}")
  public List<Request> getdept(@PathVariable String department)
  {
	  List<Request> request =  edao.findByDepartment(department).getRequest();
	  return request;
  }
  @GetMapping("/getlocation/{address}")
  public List<Request> getloc(@PathVariable String address)
  {
	  List<Request> request =  edao.findByAddress(address).getRequest();
	  return request;
  }
  @GetMapping("/getemp/{username}")
  public List<Request> getuser(@PathVariable String username)
  {
	  List<Request> request = edao.findByUsername(username).getRequest();
	  return request;
  }
  
  
//  @GetMapping("/filterby/{empId}")
//  public List<Request> getReq(@PathVariable Request empId)
//	{
//		List<Request> request=rdao.findById(empId);
//		return request;
//	}
  
  @GetMapping("/getemailId/{email}")
  public List<Request> getmail(@PathVariable String email)
  {   
	  List<Request> request =edao.findByEmail(email).getRequest();
	  return request;
  }
  
  
  
  
  
}
