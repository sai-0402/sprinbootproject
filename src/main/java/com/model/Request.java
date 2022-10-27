package com.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.model.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;
import lombok.Builder.Default;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int requestId;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "fk_employee_id")
    private Employee employee;
    private String status;
    private String requestType;
    private Date date;  // Create a date object

}