package com.simplilearn.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "student_table")
public class Student {
	
	@Id
	@GeneratedValue
	private int student_id;
	
	@Column (name = "first_name")
	private String fname;
	
	@Column (name = "last_name")
	private String lname;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name = "class_id")
	private Classes classes;
	
	
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
	
	
	

}
