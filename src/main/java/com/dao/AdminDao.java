package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Admin;

public interface AdminDao extends JpaRepository<Admin,Integer>{

}
