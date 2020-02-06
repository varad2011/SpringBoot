package com.registrationLoginPage.RegistrationLoginPage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.registrationLoginPage.RegistrationLoginPage.model.RegistrationPageModel;
import com.registrationLoginPage.RegistrationLoginPage.service.RegistrationPageService;

@RestController
public class RegistrationPageController {
	
	@Autowired
	private RegistrationPageService registrationService;
	
	//Added to database new registration..
	@RequestMapping(method = RequestMethod.POST , value = "/store")
	public void AddToDatabase(@RequestBody RegistrationPageModel model) {
	 	
		registrationService.StoreNewEntry(model);
	}
	
	//dispaly database all ragistrated entry
	@RequestMapping(method = RequestMethod.GET, value = "/display")
	public  List<RegistrationPageModel> displayOnWebPage( ) {
		
		return	registrationService.display();
	}
	
	//signle json value wise check name in database
	@RequestMapping(method = RequestMethod.POST, value = "/store1")
	public void checkIntoDatabaseKeywise(@RequestParam String name) {
		
		registrationService.userNameCheck(name);
	 	
	}
	
	//take son body and check name in database
	@RequestMapping(method = RequestMethod.POST, value = "/CheckUserAvailability")
	public void checkIntoDatabaseBodywise(@RequestBody RegistrationPageModel model) {
	 	
		registrationService.checkUserAvailabilityUsingBody(model);
	}
	
	//loginCheck
	@RequestMapping (method = RequestMethod.POST, value = "/login")
	public void LoginCheck(@RequestBody RegistrationPageModel model) {
		
		registrationService.userLoginCheck(model);
	}
}
