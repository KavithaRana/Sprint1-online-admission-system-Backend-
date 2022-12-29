package com.capgemini.admission.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;
	private String emailId;
	private int applicationId;
	private double PaymentAmount;
	private String paymentDescription;
	private LocalDate paymentDate;
	private String paymentStatus;
	@OneToOne(mappedBy = "payment")
	private Application application;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(String emailId, int applicationId, double paymentAmount, String paymentDescription,
			LocalDate paymentDate, String paymentStatus) {
		super();

		this.emailId = emailId;
		this.applicationId = applicationId;
		PaymentAmount = paymentAmount;
		this.paymentDescription = paymentDescription;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public double getPaymentAmount() {
		return PaymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		PaymentAmount = paymentAmount;
	}

	public String getPaymentDescription() {
		return paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", emailId=" + emailId + ", applicationId=" + applicationId
				+ ", PaymentAmount=" + PaymentAmount + ", paymentDescription=" + paymentDescription + ", paymentDate="
				+ paymentDate + ", paymentStatus=" + paymentStatus + ", application=" + application + "]";
	}

}
