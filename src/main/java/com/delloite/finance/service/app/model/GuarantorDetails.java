package com.delloite.finance.service.app.model;



import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class GuarantorDetails 
{
	@Id
	private long guarantorMobileNo;
	private String guarantorName;
	private String guarantorEmailId;
	private String guarantorAddress;
	
	
	
}
