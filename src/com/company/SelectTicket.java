package com.company;

import com.sun.corba.se.spi.orb.DataCollector;
import com.sun.rowset.internal.WebRowSetXmlReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.WebRowSet;

import java.net.Socket;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 * Created by Sadyksaj on 18.07.2016.
 */
public class SelectTicket {
    Statement connection = null;
    ResultSet data = null;
    LinkedList<Ticket> list = new LinkedList<>();
    int price;
    public void getInfo(Suggestion suggestion) throws SQLException {
        String cityFrom = suggestion.cityFrom;
        String cityTo = suggestion.cityTo;
        String string = "SELECT id, dep_city, dest_city, price, dest_date, dept_date, FROM flight WHERE dep_city=" + cityFrom +
                "and dest_city=" + cityTo + "order by price ASC";
        ResultSet data = connection.executeQuery(string);
        while (data.next()) {
            Ticket ticket = new Ticket(data.getInt("price"), data.getString("dept_date"), data.getString("dest_date"),
                    suggestion.roundTrip, data.getString("dept_city"), data.getString("dest_city"));
            list.add(ticket);
        }
        data = connection.executeQuery("Select id, dep_city, dest_city FROM flight WHERE dep_city=" + cityFrom + "dest_city NOT LIKE" + cityTo);
        while (data.next()){
            cityFrom = data.getString("dest_city");
            ResultSet newData = connection.executeQuery(string);
            Ticket ticket = new Ticket(newData.getInt("price"), newData.getString("dept_date"), newData.getString("dest_date"),
                    suggestion.roundTrip, newData.getString("dept_city"), newData.getString("dest_city"));
            list.add(ticket);
        }
    }
}

