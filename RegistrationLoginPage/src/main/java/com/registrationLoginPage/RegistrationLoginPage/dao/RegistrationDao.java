package com.registrationLoginPage.RegistrationLoginPage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.registrationLoginPage.RegistrationLoginPage.model.RegistrationPageModel;

@Repository
public interface RegistrationDao extends JpaRepository<RegistrationPageModel, Long>  {
	
	RegistrationPageModel findByEmailId(String name);

	RegistrationPageModel findByPassword(String password);
}
