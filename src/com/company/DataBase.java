package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;


public class DataBase {
	public static Connection dbConnection = null;
	public static void getConnection() throws SQLException {
		try {
			Class.forName("org.sqlite.JDBC");
			dbConnection = DriverManager.getConnection("jdbc:sqlite:aviasales.db");
		} catch(Exception e) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
		System.out.println("Connection succesful!");
	}
	
	// get table flight
	public static ResultSet getFlights() throws SQLException {
		Statement connection;
		connection = dbConnection.createStatement();
		ResultSet result = connection.executeQuery("select * from flight");
		return result;
	}
}