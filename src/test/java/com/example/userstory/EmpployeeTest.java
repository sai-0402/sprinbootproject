//package com.example.userstory;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.dao.EmployeeDao;
//import com.model.Employee;
//import com.model.Request;
//@SpringBootTest
//public class EmpployeeTest {
//	@Autowired
//	EmployeeDao edao;
//	@Test
//    void testGetEmployeeDao() throws Exception {
//        Employee emp0=new Employee(1,"sam","sam","sam","sam","sam",null,"sam","sam","sam");
//        edao.save(emp0);
//        Employee add1=edao.findAllByDepartment(emp0.getDepartment());
//        Employee add2=new Employee();
//        add2.setEmpId(emp0.getEmpId());
//        add2.setAddress(emp0.getAddress());
//        add2.setComplaint(emp0.getComplaint());
//        add2.setDepartment(emp0.getDepartment());
//        add2.setDevice(emp0.getDevice());
//        add2.setEmail(emp0.getEmail());
//        add2.setName(emp0.getName());
//        add2.setPassword(emp0.getPassword());
//        add2.setRequest(emp0.getRequest());
//        add2.setUsername(emp0.getUsername());
//    }
//	
//	
//	
//	
//}
