package com.tns.entity;

import java.io.Serializable;

import javax.persistence.*;

//INFORMING TO THE PROGRAM ABOUT THE DATABASE TABLE
@Entity
@Table(name = "student")
public class student implements Serializable {
   
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	
    public int getStudentId() {
		return id;
	}
	public void setStudentId(int studentId) {
		this.id = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	
}
