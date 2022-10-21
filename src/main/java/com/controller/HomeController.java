package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;
import com.dao.RequestDao;
import com.dao.UserDao;
import com.model.AuthenticateRequest;
import com.model.Employee;
import com.model.Request;
import com.model.User;

import lombok.experimental.PackagePrivate;

@RestController
public class HomeController {
 @Autowired
 EmployeeDao edao;
 @Autowired 
 RequestDao rdao;
 @Autowired 
 UserDao userdao;
 @GetMapping("/home")
 public String home()
 {
	 return "hi";
 }
// @PostMapping("/addrequest")
//	public ResponseEntity addrequest(@RequestBody Request request)
//	{
//		rdao.save(request);
//		return new ResponseEntity("request added",HttpStatus.OK);
//	}
 
 @PostMapping("/adduser")
 public String adduser(@RequestBody Employee employee)
 {
	 edao.save(employee);
	 return "useradded";
 }
 @PostMapping("/addrequest")
 public ResponseEntity<?> addRequest(@RequestBody AuthenticateRequest authenticate)
 {
     String username= authenticate.getUser().getUsername();
     String password= authenticate.getUser().getPassword();



    Employee userexists=(Employee) edao.findByUsername(username);

     if(userexists.getUsername().equals(username) && userexists.getPassword().equals(password))
    {
    Request request=authenticate.getRequest();
    rdao.save(request);
       return new ResponseEntity<>("Request added successfully",HttpStatus.OK);
     }
     else
     {
         return new ResponseEntity<>("User not found",HttpStatus.OK);
    }

 }
 
 @GetMapping("/getpagination")
 public List<Request> getpages()
 {
     Page<Request> pages=rdao.findAll(PageRequest.of(0, 3,Sort.by("date")));
     return pages.getContent();
 }
 @GetMapping("/getsecondpage")
 
 public List<Request> getpages1()
 {
     Page<Request> pages=rdao.findAll(PageRequest.of(1, 3));
     
     return pages.getContent();
 }
 
// @GetMapping("/field")
// private APIResponse<List<Request>> getproductWithSort(@PathVariable String filed)
// {
//   List<Request> allrequest=rdao.findProductWithSorting();
//   return new APIResponse<>(allrequest.size(),allrequest);
// } 
   
//    @PostMapping
	@GetMapping("findbyid/{id}")
	public Request getReq(@PathVariable int id)
	{
		Request request=rdao.findById(id).get();
		return request;
	}
//    @GetMapping("findbydept/{dept}")
//    public Request getdept(@PathVariable String dept)
//    {
//    	Request request = edao.findByDept(dept);
//    	return request;
//    }
//  @GetMapping("/filterrequest/{empId}")
//  public List<Employee> filterTodosById(@RequestBody Employee employee){
//      List<Employee> todos1 = edao.filterTodosByEmployeeId(employee);
//      return todos1;
//  }
//    
// @GetMapping("/previousandcurretrequests")
// public List<Request> requestdatewise(@RequestBody Employee employee)
// {
//	   Pageable pageable = new PageRequest(0, 10, new Sort(Sort.Direction.ASC, "date"));
//
//	   Page<Request> topPage = rdao.findByRequestDate(date, pageable);
//	   List<Request> topUsersList = topPage.getContent();
//	   return topUsersList;
// }
 

// @GetMapping("/filter")
// public ResponseEntity<List<Request>> getAllRequests(
//                     @RequestParam(defaultValue = "0") Integer pageNo, 
//                     @RequestParam(defaultValue = "10") Integer pageSize,
//                     @RequestParam(defaultValue = "id") String sortBy) 
// {
//     List<Request> list = rdao.getAllRequests(pageNo, pageSize, sortBy);
//
//     return new ResponseEntity<List<Request>>(list, new HttpHeaders(), HttpStatus.OK); 
// }
// 
// @GetMapping("/filterrequest/{reqId}")
// public List<Request> filterTodosById(@RequestBody Request request){
//     List<Request> todos = rdao.filterTodosByUserId(request);
//     return todos;
// }
// @GetMapping("/filterrequest/{empId}")
// public List<Request> filterTodosById1(@RequestBody Request request){
//     List<Request> todos1 = rdao.filterTodosByUserId(request);
//     return todos1;
// }
// @GetMapping("/filterrequest/{dept}")
// public List<Request> filterTodosById2(@RequestBody Request request){
//     List<Request> todos2 = rdao.filterTodosByDept(request);
//     return todos2;
// }
// @GetMapping("/filterrequest/{date}")
// public List<Request> filterByDate(@RequestBody Request request)
// {
//	 List<Request> bydate = rdao.filterTodosByDate(request);
//	 return bydate;
// }
 
 
 
 
 
 
// public List<Request> requestdatewise(@RequestBody Request request)
// {
//	   
// }
// @GetMapping("/filterrequest/{reqId}")
// public List<Request> filterTodosById(@RequestBody Request request){
//     List<Request> todos = rdao.filterTodosByUserId(request);
//     return todos;
// }
// @GetMapping("/filterrequest/{empId}")
// public List<Employee> filterTodosById(@RequestBody Employee employee){
//     List<Employee> todos1 = edao.filterTodosByEmployeeId(employee);
//     return todos1;
// }
 
 
 
}
