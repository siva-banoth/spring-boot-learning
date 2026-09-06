package com.vector.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value="emailService")
public class EmailService {

	@Value("${smtp.host}")
	private String smtpHost;
	
	@Value("${smtp.port}")
	private int smtpPort;
	
	@Value("${to.address}")
	private String toAddress;
	
	@Value("${from.address}")
	private String fromAddress;

	public void sendMail() {
		System.out.println("Email sent to : " + toAddress + "  from : " + fromAddress + " with smtpHost : " + smtpHost
				+ " and smtpPort : " + smtpPort);
	}
}
