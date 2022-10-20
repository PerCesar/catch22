package com.beltran.catch22.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Equipment")
public class Equipment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="itemCode", nullable = false)
	private String itemCode;
	
	@Column(name ="itemName", nullable = false)
	private String itemName;
	
	@Column(name ="itemBrand", nullable = false)
	private String itemBrand;
	
	@Column(name ="stockQuantity", nullable = false)
	private int stockQuantity;
	
	@Column(name ="price", nullable = false)
	private Float price;
	
	@Column(name ="expectedReturn", nullable = false)
	private int expectedReturn;
	
	@Column(name ="itemReturned", nullable = false)
	private int itemReturned;
	
	@Column(name ="participantNumber", nullable = false)
	private int participantNumber;
	
	public Equipment() {
		super();
	}

	public Equipment(String itemCode, String itemName, String itemBrand, int stockQuantity, Float price,
			int expectedReturn, int itemReturned, int participantNumber, Participants participant) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemBrand = itemBrand;
		this.stockQuantity = stockQuantity;
		this.price = price;
		this.expectedReturn = expectedReturn;
		this.itemReturned = itemReturned;
		this.participantNumber = participantNumber;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemBrand() {
		return itemBrand;
	}

	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public int getExpectedReturn() {
		return expectedReturn;
	}

	public void setExpectedReturn(int expectedReturn) {
		this.expectedReturn = expectedReturn;
	}

	public int getItemReturned() {
		return itemReturned;
	}

	public void setItemReturned(int itemReturned) {
		this.itemReturned = itemReturned;
	}

	public int getParticipantNumber() {
		return participantNumber;
	}

	public void setParticipantNumber(int participantNumber) {
		this.participantNumber = participantNumber;
	}


	@Override
	public String toString() {
		return "Equipment [itemCode=" + itemCode + ", itemName=" + itemName + ", itemBrand=" + itemBrand
				+ ", stockQuantity=" + stockQuantity + ", price=" + price + ", expectedReturn=" + expectedReturn
				+ ", itemReturned=" + itemReturned + ", participantNumber=" + participantNumber + "]";
	}
	
}
