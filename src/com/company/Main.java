package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.text.Normalizer;

public class Main extends Thread{
    public static void main(String[] args) throws SQLException {
    	DataBase.getConnection();
        FormNum1 form1 = new FormNum1();
    }
}
