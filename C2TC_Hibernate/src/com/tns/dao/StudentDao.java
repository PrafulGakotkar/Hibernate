package com.tns.dao;

import com.tns.entity.student;

public interface StudentDao {
	public abstract student getStudentById(int id);
	public abstract void addStudent (student student);
	public abstract void removeStudent(student student);
	public abstract void updateStudent(student student);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
}
