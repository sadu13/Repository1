package com.delloite.finance.service.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EMIDetails {

	@Id
	
	private int emiID;		
	private Double emiAmountMonthly;		
	private String nextEmiDueDate;		
	private String previousEmiStatus;		

}
