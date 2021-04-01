package com.mindtree.Passport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.Passport.entity.Passport;
import com.mindtree.Passport.entity.Person;
import com.mindtree.Passport.repository.PassportRepository;
import com.mindtree.Passport.repository.PersonRepository;
import com.mindtree.Passport.service.PassportService;

@Service
public class PassportServiceImpl implements PassportService{
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PassportRepository passportRepository;

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		personRepository.save(person);
	}

	@Override
	public void addPassport(Passport passport, int personId) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person=personRepository.findById(personId).get();
		passport.setPerson(person);
		passportRepository.save(passport);
		person.setPassport(passport);
		personRepository.save(person);
	}

	@Override
	public Person getDetails(int personId) {
		// TODO Auto-generated method stub
		Person person=personRepository.findById(personId).get();
		
		return person;
	}

}
