package com.prelude.epsilon.service;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
/**
 * Send email by gmail SMTP server
 * @author Ram
 *
 */
public class Email {
	Properties props ;
	private String fromEmail ="zhangliangqin015@gmail.com";
	private String password="***";// change the password as need
	private String toEmail = "liangqin_z@preludesys.com";// change accordingly
	public Email(){
		setSTMP();
	}
	public static void main(String[] args) {
		Email emailHandler = new Email();
	//	emailHandler.setAccountPassword(fromEmail, password, toEmail);
		emailHandler.sendEmail("Test subject from gmail", "It is from gmail account");
	}	
	public void setAccountPassword(String emailAccount,String password,String toEmail){
		this.fromEmail = emailAccount;
		this.password = password;
		this.toEmail = toEmail;
	}
	public void sendEmail(String subject,String content){
		SMTPAuthenticator authentication = this.new SMTPAuthenticator();
		Session session = Session.getDefaultInstance(this.getProp(),authentication);

		// compose message	
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(this.fromEmail));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					this.toEmail));
			message.setSubject(subject);
			message.setText(content);
			// send message
			Transport.send(message);
			//System.out.println("message sent successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
	public void setSTMP(){
		props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");		
	}
	public Properties getProp(){
		return props;
	}
     class SMTPAuthenticator extends javax.mail.Authenticator
    {
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(fromEmail, password);
        }
    }	
}
