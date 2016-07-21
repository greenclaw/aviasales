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
		
//		Statement connection;
//		connection = DataBase.dbConnection.createStatement();
//		ResultSet result = connection.executeQuery("select * from ticket;");
//	
//		int i = 1;
//		while(i < 300) {
//			String depDate = result.getString("dep_date");
//			depDate = depDate.substring(0,2) + "/" + depDate.substring(3,5)
//				+ "/" + depDate.substring(6,10);
//			String destDate = result.getString("dest_date");
//			destDate = destDate.substring(0,2) + "/" + destDate.substring(3,5)
//				+ "/" + destDate.substring(6,10);
//			int id = result.getInt("id");
//			String sql = "update ticket set dep_date = '" + depDate
//			+ "', dest_date = '" + destDate + "' "+ " where id="+i;
////			connection.executeUpdate(sql);
//			System.out.println(sql);
//			result.next();
//			i++;
//		}
	}
	
	// get table flight
	public static ResultSet getFlights() throws SQLException {
		Statement connection;
		connection = dbConnection.createStatement();
		ResultSet result = connection.executeQuery("select * from flight");
		return result;
	}
}