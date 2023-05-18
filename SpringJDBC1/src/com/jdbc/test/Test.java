package com.jdbc.test;

import com.jdbc.classes.Student;
import com.jdbc.dao.StudentDAO;
import com.jdbc.dao.StudentDAOInterfaceImplementation;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(9);
		s.setName("Susheela");
		
		StudentDAO studentobj = new StudentDAOInterfaceImplementation();
		studentobj.insert(s);
			
	}
}