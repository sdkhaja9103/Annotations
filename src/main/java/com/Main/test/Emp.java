package com.Main.test;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Emp {
	@Id
	private int id;
	
	private String name;
	private String rollno;
	public Emp() {
		super();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public Emp(int id, String name, String rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstnname=" + name + ", rollno" + rollno + "]";
	}
	
}
