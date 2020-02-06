package com.bridgelabz.fundooNotes.RegistrationPage.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.bridgelabz.fundooNotes.RegistrationPage.model.RegistrationModel;

@Service
public class RegistrationPageServices {

	List<RegistrationModel> model = new ArrayList<>(Arrays.asList(new RegistrationModel("varad", "patil", "1232", "12121212", "vaads@3434", "at-morave", "male"), new RegistrationModel("varad1", "patil1", "12232", "1222121212", "asvaads@3434", "at-moraqwve", "male")));

	public List<RegistrationModel> getList(){

		return model;
  }
	
	public void addRegistration(RegistrationModel modelRe) {
	
		model.add(modelRe);
	}
}
