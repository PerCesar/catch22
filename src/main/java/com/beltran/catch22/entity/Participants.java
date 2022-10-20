package com.beltran.catch22.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.beltran.catch22.entity.ParticipantsData;

@Entity
@Table(name = "participants")
public class Participants {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int participantNumber;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String phoneNumber;
	
	@Column(nullable = false)
	private String homeAddress;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String postalCode;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private Long birthYear;
	
	public Participants() {
		super();
		
	}

	public Participants(int participantNumber, String lastName, String firstName, String phoneNumber,
			String homeAddress, String city, String state, String postalCode, String email, Long birthYear,
			List<ParticipantsData> participantsdata) {
		super();
		this.participantNumber = participantNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.homeAddress = homeAddress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.email = email;
		this.birthYear = birthYear;
	}

	public int getParticipantNumber() {
		return participantNumber;
	}

	public void setParticipantNumber(int participantNumber) {
		this.participantNumber = participantNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Long birthYear) {
		this.birthYear = birthYear;
	}



	@Override
	public String toString() {
		return "Participants [participantNumber=" + participantNumber + ", lastName=" + lastName + ", firstName="
				+ firstName + ", phoneNumber=" + phoneNumber + ", homeAddress=" + homeAddress + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + ", email=" + email + ", birthYear=" + birthYear
				+ "]";
	}
	
	
	
	
	
}
