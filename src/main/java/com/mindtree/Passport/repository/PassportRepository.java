package com.mindtree.Passport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Passport.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Integer>{

}
