package com.prelude.epsilon.controller;

//import org.springframework.aop.aspectj.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailService { 
//	@Autowired
//	public MailSender sender;
//	@Autowired
//	public SimpleMailMessage alertmsg;
//	
//	public void sendMail(String from,String[] to,String subject,String body)
//	{
//		SimpleMailMessage mail = new SimpleMailMessage();
//		mail.setFrom(from);
//		mail.setTo(to);//mail.setTo(to);
//		//mail.setTo(to1);
//		mail.setSubject(subject);
//		mail.setText(body);
//		sender.send(mail);
//		
//	}
//	public void sendAlertMail(String alert) {
//		
//		         
//		 
//		        SimpleMailMessage mailMessage = new SimpleMailMessage(alertmsg);
//		
//		        mailMessage.setText(alert);
//		
//		        sender.send(mailMessage);
//		
//		         
//		
//		    }


}
