package com.example.userstory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.controller","com.controllerexp","com.controlleradvice"})
@EnableJpaRepositories({"com.dao"})
@EntityScan(basePackages= {"com.model"})
public class UserstoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserstoryApplication.class, args);
	}
    
}
