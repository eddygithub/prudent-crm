package com.prudent.crm.domain;

public class Address {

	private String streetAdr;
	private String state;
	private String country = "US";

	public String getStreetAdr() {
		return streetAdr;
	}

	public void setStreetAdr(String streetAdr) {
		this.streetAdr = streetAdr;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
