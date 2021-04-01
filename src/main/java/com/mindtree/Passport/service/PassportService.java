package com.mindtree.Passport.service;

import com.mindtree.Passport.entity.Passport;
import com.mindtree.Passport.entity.Person;

public interface PassportService {
	
	public void addPerson(Person person);
	
	public void addPassport(Passport passport,int personId);
	
	public Person getDetails(int personId);
}
