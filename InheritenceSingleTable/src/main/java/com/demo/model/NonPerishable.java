package com.demo.model;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("NonPerishable")
public class NonPerishable extends Product {
	
	private String category;

	public NonPerishable() {
		super();
	}

	public NonPerishable(int id, String pname, Date mfgdate,String category) {
		super(id,pname,mfgdate);
		this.category=category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "NonPerishable [category=" + category + "]";
	}
	

}
