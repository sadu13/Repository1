package com.delloite.finance.service.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity

public class EmployeeDetails {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeID;
	private String employeeName;
	private String DOB;
	private int age;
	private String gender;
	private String email;
	private Long mobileNo;
	private String pancardNo;
	private String AddharCardNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeAddress employeeAddress;

}
