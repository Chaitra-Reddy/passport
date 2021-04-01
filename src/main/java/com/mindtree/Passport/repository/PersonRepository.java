package com.mindtree.Passport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Passport.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{

}
