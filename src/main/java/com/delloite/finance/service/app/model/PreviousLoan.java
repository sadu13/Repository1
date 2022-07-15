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
public class PreviousLoan {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int ploanId;
	private double previousLoanAmount;
	private int previousTenure;
	private Double paidAmount;
	private Double remainingAmount;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanBank previousLoanBank ;
	
	

}
