package com.registrationTablejdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class RegistrationTablejdbc {
	
	public static void StoreTojdbc(String name, String lastName, String password, String gender, String emailId, String mobileNumber, String address ) {
		final String jdbcDriver = "com.mysql.jdbc.Driver"; 
		final String url = "jdbc:mysql://localhost:3306/registration?"+"autoReconnect=true&useSSL=false";
		boolean loginCheck = false;
		Connection connection = null;
		PreparedStatement statement1 = null;
		try {
			Class.forName(jdbcDriver);
			 connection = DriverManager.getConnection(url,"root","bridgeit");
			 statement1 = connection.prepareStatement("insert into registrationDetails(name, lastName, password, emailId, mobileNumber,address, gender)values(?, ?, ?, ?, ?, ?, ?)");
			 statement1.setString(1, name);
			 statement1.setString(2, lastName);
			 statement1.setString(3, password);
			 statement1.setString(4, emailId);
			 statement1.setString(5, mobileNumber); 
			 statement1.setString(6, address);
			 statement1.setString(7, gender);
			 
			 statement1.executeUpdate();
			 connection.close();
			 
		}catch(Exception e){	
		}
	}
	
	public  boolean userAvailableCheckStatus(String name) {
		boolean loginCheck = false;
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "bridgeit");
			 statement = connection.createStatement();
			 ResultSet result = statement.executeQuery("select * from registrationDetails");
			 	
			while(result.next()) {
				if(result.getString("name").equalsIgnoreCase(name)) {
						loginCheck = true;
				}
			}
			connection.close();	
		}catch(Exception e){
			
		}
		return loginCheck;	
	}
	public  boolean checkStatus(String name, String password) {
		boolean loginCheck = false;
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "bridgeit");
			 statement = connection.createStatement();
			 ResultSet result = statement.executeQuery("select * from registrationDetails");
			 	
			while(result.next()) {
				if(result.getString("name").equalsIgnoreCase(name)) {
					if(result.getString("password").equalsIgnoreCase(password)) {
						loginCheck = true;
						System.out.println(result.getString("name") + " == nameCheck" + result.getInt("password"));
					}
				}	
			}
			connection.close();	
		}catch(Exception e){	
		}
		return loginCheck;
	}
	
	public  void jdbcQueryExecute(String name, String jdbcDriver, String url){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(jdbcDriver);
			 connection = DriverManager.getConnection(url, "root", "bridgeit");
			 statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from registrationtable");
			while(result.next()) {
				System.out.println(result.getString(name) + " ");
			}
			connection.close();	
		}catch(Exception e){
			
		}
	}
	public static void main(String args[]) {
		/*
		 * String name = "vara"; int password = 134; String lastName = "ptil"; String
		 * gender = "mle"; String emailId = "pat@gmail.com"; String mobileNumber =
		 * "98679261"; String address = "pnvel";
		 * //RegistrationTablejdbc.jdbcQueryExecute(name, jdbcDriver, url);
		 * //RegistrationTablejdbc.checkStatus(name,password);
		 * RegistrationTablejdbc.StoreTojdbc(name, lastName, password, gender, emailId,
		 * mobileNumber, address);
		 */
		/*
		 * String name = "varad"; int password = 1234;
		 * RegistrationTablejdbc.checkStatus(name,password);
		 */
	}
	
	
}
