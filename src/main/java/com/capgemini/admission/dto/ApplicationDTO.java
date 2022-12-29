package com.capgemini.admission.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.capgemini.admission.entity.Payment;

public class ApplicationDTO {

	private Integer applicationId;
	
	@NotBlank(message = "The Name should not be blank,empty or Null")
	private String applicantFullName;
	
	private LocalDate dateOfBirth;
	private String highestQualification;
	
	@NotBlank(message = "The percentage field should not be blank,empty or Null")
	private double finalYearPercentage;
	
	@NotBlank(message = "The email should not be blank,empty or Null")
	@Email(message = "Please enter a valid email id", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z.]{2,5}")
	private String emailId;
	private String applicationStatus;
	
	@NotBlank(message = "The paymentId field should not be blank,empty or Null")
	private  int paymentId;
	

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicantFullName() {
		return applicantFullName;
	}

	public void setApplicantFullName(String applicantFullName) {
		this.applicantFullName = applicantFullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public double getFinalYearPercentage() {
		return finalYearPercentage;
	}

	public void setFinalYearPercentage(double finalYearPercentage) {
		this.finalYearPercentage = finalYearPercentage;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

}
