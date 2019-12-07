package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class NameDetails {

	@Value("${firstname}")
	private String firstName;
	
	@Value("${middelname}")
	private String midileName;
	
	@Value("${lastname}")
	private String lastName;
	
	@Value("${message}")
	private String message;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidileName() {
		return midileName;
	}
	public void setMidileName(String midileName) {
		this.midileName = midileName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
