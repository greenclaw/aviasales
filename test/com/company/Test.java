package com.company;
import org.junit.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * Created by antonzalaldinov on 20.07.16.
 */
public class Test {


    @org.junit.Test
    public void testOfDate(){
        assertTrue(FormNum1.doMatch("11/11/2011"));
    }

    @org.junit.Test
    public void testOfDate1(){
        assertFalse(FormNum1.doMatch("11.11.2011"));
    }


    @org.junit.Test
    public void testOfDate2(){
        assertFalse(FormNum1.doMatch("NastyaIsTheBestTA"));
    }

    @org.junit.Test
    public void checkDataBaseContainId() throws SQLException {
        DataBase.getConnection();
        ResultSet result = DataBase.getFlights();
        int id = result.getInt("id");
        assertNotNull(id);
    }

    @org.junit.Test
    public void checkDataBaseContainDestCity() throws SQLException {
        DataBase.getConnection();
        ResultSet result = DataBase.getFlights();
        String dest_city = result.getString("dest_city");
        assertNotNull(dest_city);
    }

    @org.junit.Test
    public void checkDataBaseContain3() throws SQLException {
        DataBase.getConnection();
        ResultSet result = DataBase.getFlights();
        String dep_city = result.getString("dep_city");
        assertNotNull(dep_city);
    }


}
