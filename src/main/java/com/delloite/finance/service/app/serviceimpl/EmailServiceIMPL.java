package com.delloite.finance.service.app.serviceimpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.delloite.finance.service.app.model.EmailSender;



@Service
public class EmailServiceIMPL {
	@Autowired
	JavaMailSender mailsender;

	public void sendEmail(EmailSender email) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(email.getToEmail());
		message.setFrom(email.getFromEmail());
		message.setSubject(email.getSubject());
		message.setText(email.getTextBody());
		
		mailsender.send(message);
		System.out.println("send mail");
		
	}

	public void sendEmailWithAttchachment(EmailSender email) {
		MimeMessage message=mailsender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);	
			helper.setText(email.getTextBody());
			helper.setTo(email.getToEmail());
			helper.setSubject(email.getSubject());
			helper.setFrom(email.getFromEmail());
			
			FileSystemResource resource =new FileSystemResource("H:\\Angular Notes.pdf");
			helper.addAttachment(resource.getFilename(), resource);
			mailsender.send(message);
		}
		
		catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
