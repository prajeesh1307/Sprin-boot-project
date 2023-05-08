package com.loan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	private String Email;
	private String Password;
	LoginModel(){}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LoginModel(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	@Override
	public String toString() {
		return "LoginModel [Email=" + Email + ", Password=" + Password + "]";
	}
	
	

}
