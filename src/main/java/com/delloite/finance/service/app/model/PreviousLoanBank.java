package com.delloite.finance.service.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class PreviousLoanBank {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	private String branchName;
	private double IFSCcode;
	private String branchAddress;

}
