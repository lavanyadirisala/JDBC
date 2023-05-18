package com.java.jdbc;
import java.sql.*;
public class MyApp {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		String driverClassName = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "Seneca123$";
		//String query = "insert into Student values(1, 'Anjani')";
		System.out.print("Connection establishing");
		try
				 
		{	
			Connection connection = DriverManager.getConnection(driverClassName, username, password);
			// Obtain a statement				
			Statement st = connection.createStatement();
			// Execute the query
			int count  = st.executeUpdate("INSERT INTO public.\"Student\"(\r\n"	+ "	\"Id\", \"Name\")\r\n"+ "VALUES (1, 'Anjani')");
			System.out.println("number of rows affected by this query= " + count);
			connection.close();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
}
