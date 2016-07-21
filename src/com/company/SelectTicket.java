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
  static  LinkedList<Ticket> list = new LinkedList<Ticket>();
    int price;
    public void getInfo(Suggestion suggestion) throws SQLException {
    	connection = DataBase.dbConnection.createStatement();
        String cityFrom = suggestion.cityFrom;
        String cityTo = suggestion.cityTo;
        String firstParam = getSqlStraight(cityFrom, cityTo);
       ResultSet data = connection.executeQuery(firstParam);
        if (data != null) {
            Ticket ticket = new Ticket(data.getInt("price"), data.getString("dep_date"), data.getString("dest_date"),
                    suggestion.roundTrip, data.getString("dep_city"), data.getString("dest_city"));
            while (data.next()) {
                ticket = new Ticket(data.getInt("price"), data.getString("dep_date"), data.getString("dest_date"),
                        suggestion.roundTrip, data.getString("dep_city"), data.getString("dest_city"));
                //if (ticket.dataCheck())
                    list.add(ticket);
            }
        }
        data = connection.executeQuery(getSql1Transfer(cityFrom, cityTo));
        if (data != null) {
            Ticket firstTicket = new Ticket(data.getInt("price"), data.getString("dep_date"), data.getString("dest_date"),
                    suggestion.roundTrip, data.getString("dep_city"), data.getString("dest_city"));
            String secondCityFrom = data.getString("dest_city");
            String secondParam = getSqlStraight(secondCityFrom, cityTo);
            ResultSet newData = connection.executeQuery(secondParam);
            if (newData != null) {
                Ticket secondTicket = new Ticket(newData.getInt("price"), newData.getString("dep_date"), newData.getString("dest_date"),
                        suggestion.roundTrip, newData.getString("dep_city"), newData.getString("dest_city"));
                Ticket doubleTicket = new DoubleTicket(firstTicket, secondTicket);
                if (doubleTicket.dataCheck())
                    list.add(doubleTicket);
                while (data.next()) {
                    secondTicket = new Ticket(newData.getInt("price"), newData.getString("dep_date"), newData.getString("dest_date"),
                            suggestion.roundTrip, newData.getString("dep_city"), newData.getString("dest_city"));
                    doubleTicket = new DoubleTicket(firstTicket, secondTicket);
                    if (doubleTicket.dataCheck())
                        list.add(doubleTicket);
                }
            }
        }


    }

    private String getSqlStraight (String cityFrom, String cityTo){
        return "select dep_city, dest_city, price, dest_date, dep_date  from flight " +
                "inner join company on flight.company_id = company.id inner join ticket on flight.id = ticket.flight_id" +
                " where dep_city='" + cityFrom +"' and dest_city='" + cityTo + "' order by price ASC";
    }
    private String getSql1Transfer (String cityFrom, String cityTo) {
        return "select  dep_city, dest_city, price, dest_date, dep_date from flight " +
                "inner join company on flight.company_id = company.id inner join ticket on flight.id = ticket.flight_id" +
                " where dep_city='" + cityFrom + "' and dest_city NOT LIKE '" + cityTo + "'";
    }


    public static Ticket[] getTicket()
    {
        int size = list.size();
        Ticket[] a = new Ticket[size];
        for (int i = 0; i < size ;i++)
        {
            a[i] = list.pop();
        }
        QSort.sort(a,0,size);
        return a;
    }
    public static int getCount()
    {
        return list.size();
    }
}

