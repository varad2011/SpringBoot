package com.registrationLoginPage.RegistrationLoginPage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.registrationLoginPage.RegistrationLoginPage.dao.RegistrationDao;
import com.registrationLoginPage.RegistrationLoginPage.dto.LoginPageDto;
import com.registrationLoginPage.RegistrationLoginPage.model.RegistrationPageModel;

@Service
public class RegistrationPageService {
	
	@Autowired
	private RegistrationDao registrationDao;
	
	//new entry store in database
	public void StoreNewEntry(RegistrationPageModel model) {
		registrationDao.save(model);
		}
	
	public List<RegistrationPageModel> display( ) {
		
 	 	return registrationDao.findAll();
	}
	
	//username check availability check 
	  public RegistrationPageModel userNameCheck(String name) {
	  
	  try{
		  RegistrationPageModel model = registrationDao.findByEmailId(name);
	  
	  if( model.getName().equals(name)) { 
		  System.out.println(name); 
		  return registrationDao.findByEmailId(name); 
		  }
	  
	  }catch (Exception e){ 
		  System.out.println("user not found"); 
		  }
	  
	  System.out.println("nullPoint"); 
	  return null; 
	  }
	 
	  //username availability check from body of json
	 public RegistrationPageModel checkUserAvailabilityUsingBody(RegistrationPageModel model) {
		 String emailId = model.getEmailId();
		 String moibleNumber = model.getMobileNumber();
		 try {
			 
			 RegistrationPageModel model1 = registrationDao.findByEmailId(emailId);
			
			 if ((model1.getEmailId().equals(emailId)) || (model1.getMobileNumber().equalsIgnoreCase(moibleNumber))) { 
				  System.out.println(emailId + "user already available" + moibleNumber); 
				 
				  return registrationDao.findByEmailId(emailId); 
				  }
			  
			  }catch (Exception e){ 
				  System.out.println("user not found "); 
				  return registrationDao.save(model);
				  }
			  
			  System.out.println("nullPoint"); 
			  return null; 
	 }
	
	 public void userLoginCheck(RegistrationPageModel model) {
		 String emailId = model.getEmailId();
		 String password = model.getPassword();
		 try {
			 RegistrationPageModel model1 = registrationDao.findByEmailId(emailId);
			 
			 if((model1.getEmailId().equalsIgnoreCase(emailId)) && (model1.getPassword().equalsIgnoreCase(password))) {
				 System.out.println("user Login successfully");
			 }else {
				 System.out.println("invalid username and password");
			 }
		 }catch(Exception e){
			 System.out.println("invalid username and password");
		 }
	 }
}


