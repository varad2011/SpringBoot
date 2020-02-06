package com.bridgelabz.fundooNotes.RegistrationPage.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundooNotes.RegistrationPage.model.RegistrationModel;
import com.bridgelabz.fundooNotes.RegistrationPage.service.RegistrationPageServices;

@RestController
public class HelloController {
	
	private RegistrationPageServices service ;

	@RequestMapping("receiveData")
	public void recievedData() {
	
		service.getList();
	}
	
	@RequestMapping(method = RequestMethod.POST,  value = "sendData")
	public void getRegistorData(@RequestBody RegistrationModel model) {
		service.addRegistration(model);
		
	}
}
