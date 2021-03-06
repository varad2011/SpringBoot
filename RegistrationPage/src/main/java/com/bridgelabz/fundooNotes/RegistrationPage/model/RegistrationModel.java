package com.bridgelabz.fundooNotes.RegistrationPage.model;

public class RegistrationModel {

	private String name;
	private String lastName;
	private String mobileNumber;
	private String emailId;
	private String password;
	private String address;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "RegistrationModel [name=" + name + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", password=" + password + ", address=" + address + ", gender=" + gender
				+ "]";
	}
	public RegistrationModel(String name, String lastName, String mobileNumber, String emailId, String password,
			String address, String gender) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
		this.gender = gender;
	}

	
	
}
