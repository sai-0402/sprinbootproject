package com.example.userstory;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.dao.EmployeeDao;
import com.dao.RequestDao;
import com.fasterxml.jackson.core.JsonProcessingException;
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
    	  emp.setName("sravan");
    	  emp.setPassword("sravan123");
    	  emp.setRequest(null);
    	  emp.setDevice("laptop");
    	  edao.save(emp);
      }
      @Test
      void test()
      {
    	  Request req = new Request();
    	  req.setEmployee(null);
    	  req.setRequestId(0);
    	  req.setRequestType("type");
    	  req.setDate(null);
    	  req.setStatus("pending");
    	  rdao.save(req);
      }
      @Test
      void getdept1()
      {
    	  Employee emp = new Employee();
    	  emp.setUsername("sravan");
    	  emp.setAddress("Hyd");
    	  emp.setComplaint("repair");
    	  emp.setRequest(null);
    	  emp.setDepartment("IT");
    	  emp.setRequest(null);
    	  emp.setPassword("sravan123");
    	  emp.setName(null);
    	  emp.setEmail("sravan123@gmail.com");
    	  emp.setEmpId(0);
    	  emp.setDevice(null);
    	  Employee emp1 = edao.findAllByDepartment(emp.getDepartment());
    	  Assertions.assertEquals(emp.getDepartment(),"IT");  
      }
      
      @Test
      void getuser()
      {
    	  Employee emp = new Employee();
    	  emp.setUsername("sam");
    	  emp.setAddress("Hyd");
    	  emp.setComplaint(null);
    	  emp.setRequest(null);
    	  emp.setDepartment("sas");
    	  emp.setRequest(null);
    	  emp.setPassword("sravan123");
    	  emp.setName(null);
    	  emp.setEmail(null);
    	  emp.setEmpId(0);
    	  emp.setDevice(null);
    	  Employee emp1 = edao.findByUsername(emp.getUsername());
    	  Assertions.assertEquals(emp.getUsername(),"sam");  
      }
      
      @Test
      void getemail()
      {
    	  Employee emp = new Employee();
    	  emp.setUsername("sravan");
    	  emp.setAddress("Hyd");
    	  emp.setComplaint(null);
    	  emp.setRequest(null);
    	  emp.setDepartment("sales");
    	  emp.setRequest(null);
    	  emp.setPassword("sravan123");
    	  emp.setName(null);
    	  emp.setEmail("sravan123@gmail.com");
    	  emp.setEmpId(0);
    	  emp.setDevice(null);
    	  Employee emp1 = edao.findByEmail(emp.getEmail());
    	  Assertions.assertEquals(emp.getEmail(),"sravan123@gmail.com");  
      }
  
      
      @Test
      void getadd()
      {
    	  Employee emp = new Employee();
    	  emp.setUsername("sravan");
    	  emp.setAddress("Hyd");
    	  emp.setComplaint(null);
    	  emp.setRequest(null);
    	  emp.setDepartment("sales");
    	  emp.setRequest(null);
    	  emp.setPassword("sravan123");
    	  emp.setName(null);
    	  emp.setEmail(null);
    	  emp.setEmpId(0);
    	  emp.setDevice(null);
    	  Employee emp1 = edao.findByAddress(emp.getAddress());
    	  Assertions.assertEquals(emp.getAddress(),"Hyd");  
      }
      
      //*******************************
      //for date exception and not null
      //API
      @Test
     void getbydate() throws URISyntaxException,JsonProcessingException 
        { try
    {
        RestTemplate restTemplate = new RestTemplate();
         final String baseUrl = "http://localhost:9091/getbydate/2022-10-26";
        URI uri = new URI(baseUrl);
     
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        Assertions.assertEquals(HttpStatus.OK,result.getStatusCode());
    }
    catch (HttpClientErrorException ex)
    {
        assertEquals("404 : \"Date Not Found!\"", ex.getMessage());
    }
}
    @Test
      void testrequestdao()
      {
    	  Request req = new Request();
    	  req.setEmployee(null);
    	  req.setRequestId(0);
    	  req.setRequestType(null);
    	  req.setDate(null);
    	  req.setStatus(null);
    	  rdao.save(req);
    	  Assertions.assertNotNull(rdao.findByDate(req.getDate()));
      }
      //*************
    
      
  // for email checking exception and NotNull 
  @Test
  void getemailId() throws URISyntaxException,JsonProcessingException 
     { try
 {
     RestTemplate restTemplate = new RestTemplate();
      final String baseUrl = "http://localhost:9091/getemailId/sai%40gmail.com";
     URI uri = new URI(baseUrl);
  
     ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
     Assertions.assertEquals(HttpStatus.OK,result.getStatusCode());
 }
 catch (HttpClientErrorException ex)
 {
     assertEquals("404 : \"Email Not Found!\"", ex.getMessage());
 }
}
  
  @Test
  void testEmailDao() throws Exception {
 	  Employee emp = new Employee();
 	  emp.setUsername("sravan");
 	  emp.setAddress("Hyd");
 	  emp.setComplaint(null);
 	  emp.setRequest(null);
 	  emp.setDepartment("sales");
 	  emp.setRequest(null);
 	  emp.setPassword("sravan123");
 	  emp.setName(null);
 	  emp.setEmail("sravan123@gmail.com");
 	  emp.setEmpId(0);
 	  emp.setDevice(null);
      edao.save(emp);
      Assertions.assertNotNull(edao.findByEmail(emp.getEmail()));
  }
  //********************************
  
  //API
 @Test
 void getdept() throws URISyntaxException,JsonProcessingException 
 { try
{
 RestTemplate restTemplate = new RestTemplate();
  final String baseUrl = "http://localhost:9091/getdept/sales";
 URI uri = new URI(baseUrl);

 ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
 Assertions.assertEquals(HttpStatus.OK,result.getStatusCode());
}
catch (HttpClientErrorException ex)
{
 assertEquals("404 : \"Dept Not Found!\"", ex.getMessage());
}
}
//Dao
 @Test
 void testEmployeeDao1() throws Exception {
	  Employee emp = new Employee();
	  emp.setUsername("sravan");
	  emp.setAddress("Hyd");
	  emp.setComplaint(null);
	  emp.setRequest(null);
	  emp.setDepartment("sale");
	  emp.setRequest(null);
	  emp.setPassword("sravan123");
	  emp.setName(null);
	  emp.setEmail(null);
	  emp.setEmpId(0);
	  emp.setDevice(null);
     edao.save(emp);
     Assertions.assertNotNull(edao.findAllByDepartment(emp.getDepartment()));
 }
 
 @Test
 void getlocation() throws URISyntaxException,JsonProcessingException 
 { try
{
 RestTemplate restTemplate = new RestTemplate();
  final String baseUrl = "http://localhost:9091/getlocation/Hyderabad";
 URI uri = new URI(baseUrl);

 ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
 Assertions.assertEquals(HttpStatus.OK,result.getStatusCode());
}
catch (HttpClientErrorException ex)
{
 assertEquals("404 : \"Address Not Found!\"", ex.getMessage());
}
}
  
 
 @Test
 void testAddress1Dao() throws Exception {
	  Employee emp = new Employee();
	  emp.setUsername("sravan");
	  emp.setAddress("Hyd");
	  emp.setComplaint(null);
	  emp.setRequest(null);
	  emp.setDepartment("sales");
	  emp.setRequest(null);
	  emp.setPassword("sravan123");
	  emp.setName(null);
	  emp.setEmail(null);
	  emp.setEmpId(0);
	  emp.setDevice(null);
     edao.save(emp);
     Assertions.assertNotNull(edao.findByAddress(emp.getAddress()));
 }
//for pagination
 @Test 
 void getpagiation() throws URISyntaxException,JsonProcessingException 
 { 

 RestTemplate restTemplate = new RestTemplate();
  final String baseUrl = "http://localhost:9091/getpagination";
 URI uri = new URI(baseUrl);

 ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
 Assertions.assertEquals(HttpStatus.OK,result.getStatusCode());
}
 
// @Test
// void testrequestdao1()
// {
//	  Request req = new Request();
//	  req.setEmployee(null);
//	  req.setRequestId(0);
//	  req.setRequestType(null);
//	  req.setDate(null);
//	  req.setStatus(null);
//	  rdao.save(req);
//	  Assertions.assertNotNull(rdao);
// }
// 
 
  @Test 
  void getsecondpage() throws URISyntaxException,JsonProcessingException 
  { 

  RestTemplate restTemplate = new RestTemplate();
   final String baseUrl = "http://localhost:9091/getsecondpage";
  URI uri = new URI(baseUrl);

  ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
  Assertions.assertEquals(HttpStatus.OK,result.getStatusCode());
}
}










