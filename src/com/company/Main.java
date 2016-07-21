package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.Random;

public class Main extends Thread{
	
    public static void main(String[] args) throws SQLException {
    	DataBase.getConnection();
        FormNum1 form1 = new FormNum1();
    	
    }
}
		
		//		int i = 0;
//		Random rand = new Random();

//		while(i < 10) {
//			i++;
//			int id = result.getInt("id");
//			String city = result.getString("city");
//			String airoport = result.getString("airoport");
//			result.next();
//			int randNumber = rand.nextInt(200) + 1;
//			System.out.println(randNumber);
//			String sql = "insert into company(id,name) "
//					+ "select id,airport from temp "
//					+ "where id=" + randNumber;
//			String sql = "update flight set dep_city=(select dest_city "
//					+ "from flight where id=" + randNumber + ")";
//			DataBase.connection.executeUpdate(sql);
//			System.out.println(id + " " + city + " " + airoport);
//		}
//    }
//}
