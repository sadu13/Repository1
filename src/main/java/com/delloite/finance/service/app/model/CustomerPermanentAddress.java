package com.delloite.finance.service.app.model;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class CustomerPermanentAddress {
	
	@Id
	
	private String pincode;
	private String areaName;
	private String cityName;
	private String district;
	private String state;
	
	
	
}
