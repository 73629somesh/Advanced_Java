package com.demo.model;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Perishable")
public class Perishable extends Product {
	
	private Date expiryDate;

	public Perishable() {
		super();
		
	}

	public Perishable(int id, String pname, Date mfgdate,Date expiryDate) {
		super(id, pname, mfgdate);
		this.expiryDate=expiryDate;;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Perishable [expiryDate=" + expiryDate + "]";
	}



	
	
	
}
