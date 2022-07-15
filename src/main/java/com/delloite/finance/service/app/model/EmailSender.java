package com.delloite.finance.service.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmailSender {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String toEmail;
	 private String fromEmail;
	 private String subject;
	 private String textBody;
	
}
