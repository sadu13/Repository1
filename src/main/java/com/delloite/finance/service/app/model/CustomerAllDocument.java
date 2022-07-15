package com.delloite.finance.service.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class CustomerAllDocument {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer  documentId;
	@Lob
	private byte[] panCopy;
	@Lob
	private byte[] uidCopy;
	@Lob
	private byte[] bankPassBookCopy;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] cancelledCheck;
	@Lob
	private byte[] salarySlip;
	
	
	
}
