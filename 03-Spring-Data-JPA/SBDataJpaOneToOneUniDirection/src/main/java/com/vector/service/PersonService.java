package com.vector.service;

import com.vector.entity.Passport;
import com.vector.entity.Person;

public interface PersonService {
	
	
	 Person addPassport(Person person, Passport passport);
	
	 Person savePerson(Person person);
	 
	 Person fetchPerson(Long id);
	 
	 void deletePerson(Long id);

}
