package com.mindtree.Passport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Passport.entity.Person;
import com.mindtree.Passport.service.PassportService;

@RestController
public class PersonController {
	
	@Autowired
	private PassportService passportService;
	
	@PostMapping("/savePerson")
	public void addPerson(@RequestBody Person person) {
		passportService.addPerson(person);
	}
	
	@GetMapping("/getDetails/{personId}")
	public Person getDetails(@PathVariable int personId) {
		return passportService.getDetails(personId);
	}
	
}
