package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;


public class DataBase {
	public static Statement connection ;
	public static Connection dbConnection = null;
	public static ResultSet getFlights() throws SQLException {
		connection = dbConnection.createStatement();
		ResultSet result = connection.executeQuery("select * FROM flight");
		return result;
	}
	public static void getConnection() throws SQLException   {

		try {
			Class.forName("org.sqlite.JDBC");
			dbConnection = DriverManager.getConnection("jdbc:sqlite:aviasales.db");
		} catch(Exception e) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
		System.out.println("Connection succesful!");
		connection = dbConnection.createStatement();
		String[][] cities = new String[0][0];
		ResultSet result = connection.executeQuery("select * from flight");
		int i = 0;
		Random rand = new Random();

//		while(result.next()) {
//			int id = result.getInt("id");
//			String depCity = result.getString("dep_city");
//			String destCity = result.getString("dest_city");
//			int randNumber = rand.nextInt(200) + 1;
//			System.out.println(randNumber);
//			String sql = "update flight set dep_city=(select dest_city "
//					+ "from flight where id=" + randNumber + ")";
//			connection.executeUpdate(sql);
//			System.out.println(id + " " + depCity + " " + destCity);
		}		
	}
