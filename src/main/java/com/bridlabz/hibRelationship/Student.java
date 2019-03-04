package com.bridlabz.hibRelationship;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private int marks;
	private String name;
	@OneToMany
	private List<Laptop> laptop=new ArrayList<Laptop>();//u should change getter setter to list of laptop

	/*@ManyToMany
	private List<Laptop> laptop=new ArrayList<Laptop>();
	 *
	 * @OneToOne private Laptop laptop;
	 */
	

	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
