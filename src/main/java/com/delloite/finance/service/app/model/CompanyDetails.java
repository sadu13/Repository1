package com.delloite.finance.service.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class CompanyDetails 
{
	@Id
	private Integer companyID;
	private String companyRegistrationNo;
	private String companyName;
	private String email;
	private long contactNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CompanyAddress companyAddress;

	
	

}
