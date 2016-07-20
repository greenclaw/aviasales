package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;


public class DataBase {
	public static Statement connection;
	public static Connection dbConnection;
	
	public static void getConnection() throws SQLException   {
		Connection dbConnection = null;
		try {
			Class.forName("org.sqlite.JDBC");
			dbConnection = DriverManager.getConnection("jdbc:sqlite:aviasales.db");
			System.out.println("Connection succesful!");
		} catch(Exception e) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
		
		connection = dbConnection.createStatement();
		
		ResultSet result = DataBase.connection.executeQuery("select * from temp");
		int i = 0;
		Random rand = new Random();
		
//		for (i = 0; i < 300; i++){
//			int idFlight = rand.nextInt(300) + 1;
//			int depDay = rand.nextInt(29)+1;
//			String depMonth = "08\\";
//			String dateNull = "";
//			if (depDay < 10) {
//				dateNull = "0";
//			} 
//			String depDate = depMonth + dateNull + depDay + "\\" + "2016";
//			dateNull = "";
//			String destDate = depDate;
//			int depH = rand.nextInt(24);
//			int destH = depH + rand.nextInt(14);
//			if (destH > 24) {
//				destH = destH - 24;
//				if (depDay + 1 < 10) {
//					dateNull = "0";
//				}
//				destDate = depMonth + dateNull + (depDay + 1) + "\\" + "2016";					
//			}
//			int depM = rand.nextInt(60) + 1;
//			String depMinut = Integer.toString(depM);
//			if (depM < 10) {
//				depMinut = "0" + depM;
//			}
//			int destM = rand.nextInt(60) + 1;
//			String destMinut = Integer.toString(destM);
//			if (destM < 10) {
//				destMinut = "0" + destM;
//			}
//			
//			String depTime = "";
//			if (depH < 10) {
//				depTime = "0" + depH + ":" + depMinut;
//			} else {
//				depTime = depH + ":" + depMinut;
//			}
//			String arrTime = "";
//			if (destH < 10) {
//				arrTime = "0" + destH + ":" + destMinut;
//			} else {
//				arrTime = destH + ":" + destMinut;
//			}
//			
//			String sql = "insert into "
//					+ "ticket(id,dep_date,dest_date,dep_time,arr_time,flight_id) "
//					+ "values ("  + i + ",'" + depDate + "','" + destDate
//					+ "','" + depTime + "','" + arrTime + "'," + idFlight + ");";
//			System.out.println(sql);
//			connection.executeUpdate(sql);
//		}
//		while(i < 50) {
//			String tempCity = result.getString("city");
//	
//			if (!tempCity.equals(prevCity)) {
//				cities[i][0] = Integer.toString(i + 1);
//				cities[i][1] = tempCity;
//				System.out.println(cities[i][0] + " " + cities[i][1]);
//				prevCity = tempCity;
//				i++;
//			}
//			result.next();
//		}
		
		
//		String[][] cities = new String[50][2];
//		String[][] flight = new String[300][4];
//		for (i = 0; i < 300; i++){
//			int ran = rand.nextInt(50);
//			String cityFr = cities[ran][1];
//			ran = rand.nextInt(50);
//			String cityT = cities[ran][1];
//			while (cityT == cityFr) {
//				ran = rand.nextInt(50);
//				cityT = flight[ran][1];
//			}
//			ran = rand.nextInt(3) + 1;
//			flight[i][0] = Integer.toString(i + 1);
//			flight[i][1] = Integer.toString(ran);
//			flight[i][2] = cityFr;
//			flight[i][3] = cityT;
//			String sql = "insert into flight(id,company_id,dep_city,dest_city) "
//					+ "values ("  + flight[i][0] + "," + flight[i][1] + ",'" + 
//					flight[i][2] + "','" + flight[i][3] + "');";
//			System.out.println(sql);
//			connection.executeUpdate(sql);
//			System.out.println(flight[i][0] + " " + flight[i][1] + " " + flight[i][2] + " " + flight[i][3]);
		}
	
		
		
//		connection = dbConnection.createStatement();
//		String[][] cities = new String[0][0];
//		ResultSet result = connection.executeQuery("select * from flight");
//		int i = 0;
//		Random rand = new Random();
//
//		while(i < 3) {
//			i++;
//			int id = result.getInt("id");
//			String depCity = result.getString("dep_city");
//			String destCity = result.getString("dest_city");
//			int randNumber = rand.nextInt(200) + 1;
//			System.out.println(randNumber);
//			String sql = "insert into company(id,name) "
//					+ "select id,airport from temp "
//					+ "where id=" + randNumber;
//			String sql = "update flight set dep_city=(select dest_city "
//					+ "from flight where id=" + randNumber + ")";
//			connection.executeUpdate(sql);
//			System.out.println(id + " " + depCity + " " + destCity);
//		}
}

