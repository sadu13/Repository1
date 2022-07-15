package com.delloite.finance.service.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CompanyAddress {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int addressID;
	private String areaname;
	private String cityname;
	private String district;
	private String pincode;
	private String state;

	





}
