package com.delloite.finance.service.app.model;

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
public class LoanDetails 
{
	@Id
	
	private int loanId;		
	private int loanNo;		
	private Double loanAmount;		
	private	int rateOfInterest;		
	private int tenure;	
	private Double totalAmounttobepaid;	
	private int processingFees;	
	private Double totalInterest;		
	private String sanctionDate;	
	private String remark;	
	private String status;		

	@OneToOne(cascade = CascadeType.ALL)
	private EMIDetails Emidetails;	
}
