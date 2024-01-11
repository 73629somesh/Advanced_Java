package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserAddress")
public class Address {
	@Id
	private int addid;
	private String city;
	private String street;
	public Address() {
		super();
	}
	public Address(int addid, String city, String street) {
		super();
		this.addid = addid;
		this.city = city;
		this.street = street;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", street=" + street + "]";
	}
	
}
