package com.delloite.finance.service.app.controller;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.delloite.finance.service.app.model.EmailSender;

import com.delloite.finance.service.app.serviceimpl.EmailServiceIMPL;

	@CrossOrigin("*")
	@RestController
	public class EmailHomeController {
		
		
		@Value("${spring.mail.username}")
	   private String fromEmail;   // value will get from application properties 
		
		@Autowired
		EmailServiceIMPL es;
		
		
		//post api
		@PostMapping(value="/sendEmail")
		public String sendEmail(@RequestBody EmailSender email)
		{
			email.setFromEmail(fromEmail);
			try
			{
				es.sendEmail(email);	
			}
			catch(Exception e)
			{
				return "mail not sent successfully";
			}
			
			return "mail sent successfully";
			
		}
		
		
		@PostMapping(value="/sendEmailwithAttchment")
		public String sendEmailwithAttchment(@RequestBody EmailSender email)
		{
			email.setFromEmail(fromEmail);
			try
			{
				es.sendEmailWithAttchachment(email);	
			}
			catch(Exception e)
			{
				return "mail not sent successfully";
			}
			
			return "mail sent successfully";
			
		}
		
		
	}


