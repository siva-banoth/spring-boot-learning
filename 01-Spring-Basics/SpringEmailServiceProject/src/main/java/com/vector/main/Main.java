package com.vector.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vector.beans.DatabaseRepository;
import com.vector.beans.EmailService;
import com.vector.config.AppConfig;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmailService emailService = context.getBean(EmailService.class);
		emailService.sendMail();

		System.out.println("============================");

		DatabaseRepository databaseRepository = context.getBean(DatabaseRepository.class);
		databaseRepository.showDatabaseProperties();
	}
}
