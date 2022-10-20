package com.beltran.catch22.entity;

import java.util.List; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "participantsdata")
public class ParticipantsData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pictureNumber", nullable = false)
	private int pictureNumber;
	
	@Column(name="birdCode", nullable=false)
	private String birdCode;

	@Column(name="dateTaken", nullable=false)
	private String dateTaken;
	
	@Column(name="speciesIdentifiedByOrganizer", nullable=false)
	private String speciesIdentifiedByOrganizer;
	
	@Column(name= "numberOfSpecies", nullable=false)
	private String numberOfSpecies;
	
	@Column(name="participantNumber", nullable=false)
	private String participantNumber;
	
	@Column(name="parkOrganizerNumber", nullable=false)
	private String parkOrganizerNumber;
	

	
	
	public ParticipantsData() {
		super();
	}

	public ParticipantsData(int pictureNumber, String birdCode, String dateTaken, String speciesIdentifiedByOrganizer, String numberOfSpecies,
			String participantNumber, String parkOrganizerNumber, Participants participants) {
		super();
		this.pictureNumber = pictureNumber;
		this.birdCode = birdCode;
		this.dateTaken = dateTaken;
		this.speciesIdentifiedByOrganizer = speciesIdentifiedByOrganizer;
		this.numberOfSpecies = numberOfSpecies;
		this.participantNumber = participantNumber;
		this.parkOrganizerNumber = parkOrganizerNumber;
	}

	public int getPictureNumber() {
		return pictureNumber;
	}

	public void setPictureNumber(int pictureNumber) {
		this.pictureNumber = pictureNumber;
	}

	public String getBirdCode() {
		return birdCode;
	}

	public void setBirdCode(String birdCode) {
		this.birdCode = birdCode;
	}

	public String getDateTaken() {
		return dateTaken;
	}

	public void setDateTaken(String dateTaken) {
		this.dateTaken = dateTaken;
	}

	public String getSpeciesIdentifiedByOrganizer() {
		return speciesIdentifiedByOrganizer;
	}

	public void setSpeciesIdentifiedByOrganizer(String speciesIdentifiedByOrganizer) {
		this.speciesIdentifiedByOrganizer = speciesIdentifiedByOrganizer;
	}

	public String getNumberOfSpecies() {
		return numberOfSpecies;
	}

	public void setNumberOfSpecies(String numberOfSpecies) {
		this.numberOfSpecies = numberOfSpecies;
	}

	public String getParticipantNumber() {
		return participantNumber;
	}

	public void setParticipantNumber(String participantNumber) {
		this.participantNumber = participantNumber;
	}

	public String getParkOrganizerNumber() {
		return parkOrganizerNumber;
	}

	public void setParkOrganizerNumber(String parkOrganizerNumber) {
		this.parkOrganizerNumber = parkOrganizerNumber;
	}


	@Override
	public String toString() {
		return "ParticipantsData [pictureNumber=" + pictureNumber + ", birdCode=" + birdCode + ", dateTaken="
				+ dateTaken + ", speciesIdentifiedByOrganizer=" + speciesIdentifiedByOrganizer
				+ ", numberOfSpecies=" + numberOfSpecies + ", participantNumber=" + participantNumber
				+ ", parkOrganizerNumber=" + parkOrganizerNumber + "]";
	}
	
	
}









