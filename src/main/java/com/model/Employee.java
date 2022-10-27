package com.model;
import java.util.List;

import javax.persistence.*;

import com.model.Request;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String name;
    private String username;
    private String password;
    private String email;
    private String department;
    @OneToMany(mappedBy="employee")
    @JsonIgnore
    private List<Request> request;
    private String device;
    
    private String address;
    
    private String complaint;
    public Employee(int empId, String name, String username, String password) {
		super();
		this.empId = empId;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public Employee() {
		super();
	}

//	public Employee get() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

		}