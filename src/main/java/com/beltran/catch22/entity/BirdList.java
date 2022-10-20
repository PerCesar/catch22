package com.beltran.catch22.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name= "birdList")
public class BirdList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "birdCode", nullable = false)
	private String birdCode;
	
	@Column(name= "speciesName", nullable = false)
	private String speciesName;
	
	@Column(name= "birdClass", nullable = false)
	private String birdClass;
	
	public BirdList () {
		super();
	}

	public BirdList(String birdCode, String speciesName, String birdClass, List<ParticipantsData> participantsData) {
		super();
		this.birdCode = birdCode;
		this.speciesName = speciesName;
		this.birdClass = birdClass;
	}

	public String getBirdCode() {
		return birdCode;
	}

	public void setBirdCode(String birdCode) {
		this.birdCode = birdCode;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

	public String getBirdClass() {
		return birdClass;
	}

	public void setBirdClass(String birdClass) {
		this.birdClass = birdClass;
	}

	@Override
	public String toString() {
		return "BirdList [birdCode=" + birdCode + ", speciesName=" + speciesName + ", birdClass=" + birdClass
				+ "]";
	}
	

}
