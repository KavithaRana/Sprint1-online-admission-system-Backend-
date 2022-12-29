package com.capgemini.admission.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class UserDTO {

	private int userId;
	
	@NotBlank(message = "The firstName should not be blank,empty or Null")
	private String firstName;
	private String middleName;
	@NotBlank(message = "The lastName should not be blank,empty or Null")
	private String lastName;
	
	@NotBlank(message = "The email should not be blank,empty or Null")
	@Email(message = "Please enter a valid email id", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z.]{2,5}")
	private String email;

	@NotBlank(message = "The mobile number should not be blank,empty or Null")
	private String mobileNumber;
	
	
	@NotBlank(message = "The Aadhar card number should not be blank,empty or Null")
	private String aadharCardNo;
	
	
	@NonNull
	@NotBlank(message = "Password is mandatory")
	private String password;
	
	@NotBlank(message = "Please enter role as either admin or user")
	private String role;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
