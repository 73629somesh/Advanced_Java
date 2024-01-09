package com.demo.model;

public class Employee {

	private int Id;
	private String Name;
	private double Sal;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	public Employee(int id, String name, double sal) {
		super();
		Id = id;
		Name = name;
		Sal = sal;
	}
	
	
	
}
