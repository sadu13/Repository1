package com.delloite.finance.service.app.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class VehicleDetails {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vehicleId;
	private String vehicleMake;
	private String vehicleModel;
	private String vehicleEngineType;
	private String vehicleColour;
	
}
