package com.demo.model;



import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="ProductJoin")
@Inheritance(strategy=InheritanceType.JOINED)

public class Product {
@Id
private int id;
private String pname;
private Date mfgdate;

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public Product(int id, String pname, Date mfgdate) {
	super();
	this.id = id;
	this.pname = pname;
	this.mfgdate = mfgdate;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public Date getMfgdate() {
	return mfgdate;
}

public void setMfgdate(Date mfgdate) {
	this.mfgdate = mfgdate;
}

@Override
public String toString() {
	return "Product [id=" + id + ", pname=" + pname + ", mfgdate=" + mfgdate + "]";
}




	
	
}
