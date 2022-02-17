package com.example.entity;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {

	@Size(min=2)
	@NotEmpty
	private String userId;
	@NotEmpty
	private String userPin;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPin() {
		return userPin;
	}
	public void setUserPin(String userPin) {
		this.userPin = userPin;
	}
	
	
}
