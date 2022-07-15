package com.delloite.finance.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EntityScan
@EnableJpaRepositories
@SpringBootApplication

public class DelloiteCarLoanManagmentSystemProject1Application {

	public static void main(String[] args) {
		System.out.println("CarLoanManagementProject");
		SpringApplication.run(DelloiteCarLoanManagmentSystemProject1Application.class, args);
		
	}

}
