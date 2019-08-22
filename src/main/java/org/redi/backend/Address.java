package org.redi.backend;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int houseNumber;
	private String street;
	private String city;
	private String provence;
	private String PostalCode;
	
	public Address()
	{
		
		
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvence() {
		return provence;
	}

	public void setProvence(String provence) {
		this.provence = provence;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	
	

}
