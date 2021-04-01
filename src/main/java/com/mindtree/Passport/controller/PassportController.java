package com.mindtree.Passport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Passport.entity.Passport;
import com.mindtree.Passport.service.PassportService;

@RestController
public class PassportController {
	
	@Autowired
	private PassportService passportService;
	
	@PostMapping("/savePassport/{personId}")
	public void addPassport(@RequestBody Passport passport,@PathVariable int personId) {
		passportService.addPassport(passport, personId);
	}
	
}
