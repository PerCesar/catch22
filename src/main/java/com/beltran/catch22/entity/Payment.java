package com.beltran.catch22.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="checkNumber", nullable = false)
	private String checkNumber;
	
	@Column(name="stateIdNumber", nullable = false)
	private int stateIdNumber;
	
	@Column(name="creditCardNumber", nullable = false)
	private String creditCardNumber;
	
	@Column(name="expirationDate", nullable = false)
	private String expirationDate;
	
	@Column(name="securityCode", nullable = false)
	private String securityCode;
	
	@Column(name="paymentDate", nullable = false)
	private String paymentDate;
	
	@Column(name="amount", nullable = false)
	private Float amount;
	
	@Column(name="participantNumber", nullable = false)
	private int participantNumber;
	
	public Payment() {
		super();
	}

	public Payment(String checkNumber, int stateIdNumber, String creditCardNumber, String expirationDate,
			String securityCode, String paymentDate, Float amount, int participantNumber, Participants participant) {
		super();
		this.checkNumber = checkNumber;
		this.stateIdNumber = stateIdNumber;
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.participantNumber = participantNumber;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public int getStateIdNumber() {
		return stateIdNumber;
	}

	public void setStateIdNumber(int stateIdNumber) {
		this.stateIdNumber = stateIdNumber;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public int getParticipantNumber() {
		return participantNumber;
	}

	public void setParticipantNumber(int participantNumber) {
		this.participantNumber = participantNumber;
	}

	@Override
	public String toString() {
		return "Payment [checkNumber=" + checkNumber + ", stateIdNumber=" + stateIdNumber + ", creditCardNumber="
				+ creditCardNumber + ", expirationDate=" + expirationDate + ", securityCode=" + securityCode
				+ ", paymentDate=" + paymentDate + ", amount=" + amount + ", participantNumber=" + participantNumber
				+ "]";
	}
	
}












