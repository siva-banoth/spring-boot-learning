package com.vector.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Passport;
import com.vector.entity.Person;
import com.vector.service.PersonService;

@Component
public class MyAppRunner implements ApplicationRunner {
	
	@Autowired
	PersonService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// savePerson();
		 fetchPerson(1L);
		//deletePerson(1L);
		
	}

	private void savePerson() {
		
		// calling add passport
		
		Person person = new Person();
		person.setName("JOHN");
		person.setGender("Male");
		
		Passport passport = new Passport();
		passport.setPassportNumber("A4588911");
		passport.setExpireDate(LocalDate.of(2035, 03, 21));
		
		service.addPassport(person, passport);
		
		
		// calling save person
		
		service.savePerson(person);
		
	}
	
	private void fetchPerson(Long id) {
		Person person = service.fetchPerson(id);
		System.out.println(person);
	}
	
	private void deletePerson(Long id) {
		service.deletePerson(id);
	}

	
}
