package com.mindtree.Passport.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Passport {
	
	@Id
	private int passportId;
	private String passportNumber;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="person_id")@JsonIgnore
	private Person person;
	
	public Passport() {	
	}
	
	public Passport(int passportId, String passportNumber) {
		super();
		this.passportId = passportId;
		this.passportNumber = passportNumber;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
