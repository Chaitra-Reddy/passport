package com.mindtree.Passport.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String name,birthPlace;
	private int age;
	@OneToOne(mappedBy="person")
	private Passport passport;
	
	public Person() {	
	}
	
	public Person(int personId, String name, String birthPlace, int age) {
		super();
		this.personId = personId;
		this.name = name;
		this.birthPlace = birthPlace;
		this.age = age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	

}
