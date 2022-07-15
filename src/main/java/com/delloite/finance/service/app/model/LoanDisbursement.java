package com.delloite.finance.service.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LoanDisbursement {

	@Id
	
	private int agreementid;
	private String agrrementDate;
	private int customerid;
	private Double totalAmount;
	private String bankName;
	private Double accountNumber;
	private Double IFSCCode;
	private Double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;


}
