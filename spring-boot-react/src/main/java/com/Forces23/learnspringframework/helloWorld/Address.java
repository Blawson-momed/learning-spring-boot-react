package com.Forces23.learnspringframework.helloWorld;

public class Address {
	private String streetAddress = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private int zip = 00000;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String streetAddress, String city, String state, String country, int zip) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	
	//street address
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	//city
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	//state
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	//country
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	//zip
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	

	
}
