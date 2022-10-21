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

//@SpringBootTest 
//public class TestCase {
//	   @Autowired 
//	   RequestDao rdao;
//	   @Autowired 
//	   EmployeeDao edao;
//       @Test
//       void test() {
//    	   Request req = new Request();
//    	   req.setReqId(0);
//    	   req.setNotes(null);
//    	   req.setEmployee(null);
//    	   req.setNotes(null);
//    	   req.setReqType(null);
//    	   req.setEmployee(null);
//    	   req.setDate(null);
//    	   rdao.save(req);
//    	   Request req1=rdao.findById(req.getReqId()).get();
//    	   Assertions.assertEquals(req.getReqId(),req.getReqId()); 
//       } 
//      @Test
//      void test1()
//      {
//    	  Employee emp = new Employee();
//    	  emp.setEmpId(1);
//    	  emp.setDept(null);
//    	  emp.setName(null);
//    	  emp.setPassword(null);
//    	  emp.setRequest(null);
//    	  emp.setDevice(null);
//    	  edao.save(emp);
//    	  
//      }
//}
