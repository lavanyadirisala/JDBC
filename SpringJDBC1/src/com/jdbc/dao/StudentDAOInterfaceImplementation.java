package com.jdbc.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc.classes.Student;  

public class StudentDAOInterfaceImplementation implements StudentDAO {

	public JdbcTemplate jdbctemp = new JdbcTemplate(getDataSource());
	
	@Override
	public void insert(Student stud) {
		String query = " INSERT INTO STUDENT(Id, Name) VALUES (?, ?)" ;
		Object[] obj = {stud.getId(), stud.getName()};
		jdbctemp.update(query,obj);
		System.out.println("Data inserted Successfully");
		
	}
	public DataSource getDataSource() {
		String driverClassName = "jdbc:postgresql://localhost:5432/postgres?useSSL=false";
		String username = "postgres";
		String password = "Seneca123$";
		
		DataSource datasource = new DriverManagerDataSource(driverClassName, username, password);
		return datasource;
	}
}
