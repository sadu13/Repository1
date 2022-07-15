package com.delloite.finance.service.app.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Ledger {
	@Id
	
	private int ledgerId;
	private String ledgerCreatedDate;	
	private Double totalLoanAmount;	
	private Double payableAmountwithInterest;		
	private int tenure;	
	private Double monlyEMI;	
 	private Double amountPaidtillDate;	
	private Double remainingAmount;		
	private String nextEmiDatestart;	
	private String nextEmiDateEnd;
	private int defaulterCount;
	private String previousEmitStatus;		
	private String currentMonthEmiStatus;		
	private String loanEndDate;	
	private String loanStatus;		

}
