package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Normalizer;

public class Main extends Thread{
    public static void main(String[] args) throws SQLException {
    	DataBase.getConnection();
    	
        try
        {
            FormNum1 form1 = new FormNum1();
        }
        catch (InterruptedException e1)
        {

        }

    }
}
