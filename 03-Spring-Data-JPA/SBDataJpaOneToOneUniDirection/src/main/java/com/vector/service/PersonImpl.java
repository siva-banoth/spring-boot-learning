package com.vector.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.entity.Passport;
import com.vector.entity.Person;
import com.vector.repository.PersonRepository;

@Service("personService")
public class PersonImpl implements PersonService {

	@Autowired
	PersonRepository repository;

	@Override
	public Person addPassport(Person person, Passport passport) {
		person.setPassport(passport);
		return person;
	}

	@Override
	public Person savePerson(Person person) {
		person = repository.save(person);
		return person;
	}

	@Override
	public Person fetchPerson(Long id) {
		Optional<Person> optional = repository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void deletePerson(Long id) {
		repository.deleteById(id);

	}
}
