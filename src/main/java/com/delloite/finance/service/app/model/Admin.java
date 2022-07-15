package com.delloite.finance.service.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Admin {
 @Id

 private int companyID;
 private String CompanyName;
 
@OneToOne(cascade = CascadeType.ALL)
 private CompanyDetails companydetails;

// @OneToMany(cascade = CascadeType.ALL)
// private Set<Enquiry> enquiry=new HashSet<>();
 
 @OneToMany(cascade = CascadeType.ALL)
 private Set<EmployeeDetails> employeeDetails=new HashSet<>();
 
 @OneToMany(cascade = CascadeType.ALL)
 private Set<CustomerDetails> customerDetails=new HashSet<>();
 
 
 
}
