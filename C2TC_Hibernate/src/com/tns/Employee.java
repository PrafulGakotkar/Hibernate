package com.tns.jpastartLentities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="EMP")

public class Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int empid;
	private String name;
	private double salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
