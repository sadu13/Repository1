package com.delloite.finance.service.app.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeLocalAddress
{
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
	private String areaname;
	private String cityname;
	private String district;
	private String state;
	private int pincode;
	private int houseNo;
	private String streetName;	


}
