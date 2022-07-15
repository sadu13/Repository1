package com.delloite.finance.service.app.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeePermanentAddress

{
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
	private String areaName;
	private String cityName;
	private String district;
	private String state;
	private String pincode;
	private String houseNo;
	private String streetName;

	
}
