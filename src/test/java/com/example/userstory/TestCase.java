package com.example.userstory;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.EmployeeDao;
import com.dao.RequestDao;
import com.model.Employee;
import com.model.Request;

@SpringBootTest 
public class TestCase {
	   @Autowired 
	   RequestDao rdao;
	   @Autowired 
	   EmployeeDao edao;
      @Test
      void test1()
      {
    	  Employee emp = new Employee();
    	  emp.setEmpId(1);
    	  emp.setDepartment(null);
    	  emp.setName(null);
    	  emp.setPassword(null);
    	  emp.setRequest(null);
    	  emp.setDevice(null);
    	  edao.save(emp);
      }
      @Test
      void test()
      {
    	  Request req = new Request();
    	  req.setEmpId(null);
    	  req.setRequestId(0);
    	  req.setRequestType(null);
    	  req.setDate(null);
    	  req.setStatus(null);
    	  rdao.save(req);
      }
      
      
      
      
      
      
      
      
}
