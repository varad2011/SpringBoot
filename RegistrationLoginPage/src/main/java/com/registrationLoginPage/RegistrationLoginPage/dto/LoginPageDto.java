package com.registrationLoginPage.RegistrationLoginPage.dto;

public class LoginPageDto {
	private String emailId;
	private String  password;
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginPageDto [emailId=" + emailId + ", password=" + password + "]";
	}
}
