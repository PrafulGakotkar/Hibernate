package com.tns.client;

import com.tns.entity.student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {
	
	public static void main(String []args) {
		StudentService service = new StudentServiceImpl();
		student stud = new student();
//		stud.setStudentId(6);
//		stud.setName("Ajinkya");
//		service.addStudent(stud);

		//find opereation
		stud = service.findStudentById(6);
		System.out.println("ID:"+stud.getStudentId());
		System.out.println("Name:"+stud.getName());
//		//delete opereation

		System.out.println("complete process");
		
	}

}
