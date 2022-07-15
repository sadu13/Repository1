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
public class EmployeeAddress 
{
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int addressID;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeePermanentAddress employeePermanentAddress ;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeLocalAddress employeelocalAddress ;
	
	

}
