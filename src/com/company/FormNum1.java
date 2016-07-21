package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rinathatipov on 17.07.16.
 */
public class FormNum1 extends JFrame {

    public static final Pattern pattern = Pattern.compile
            ("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");

    public static boolean doMatch(String word) {
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }


    JButton clearConfermation, conferm;
    JLabel dateofDeparture, dateofArrival, cityFrom, cityTo;
    JTextField dateofDepartureTextField, dateofArrivalTextField, cityFromTextField, cityToTextField;
    static Suggestion suggestion;
    Boolean n = false;
    JFrame form1 = new JFrame("form1");
    ActionListener actionPerformed;
    public FormNum1(){
        form1.setVisible(true);
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form1.setSize(1200,250);
        //setResizable(false);
        form1.setLocationRelativeTo(null);
        form1.setLayout(new FlowLayout());
        clearConfermation = new JButton("Make clear");
        conferm = new JButton("Confirm information ");
        dateofDeparture = new JLabel("Date of Departure");
        dateofArrival = new JLabel("Date of Arrival");
        cityFrom = new JLabel("City From");
        cityTo = new JLabel("City to");
        dateofDepartureTextField = new JTextField(10);
        dateofArrivalTextField = new JTextField(10);
        cityFromTextField = new JTextField(10);
        cityToTextField = new JTextField(10);
        form1.add(clearConfermation);
        form1.add(conferm);
        form1.add(dateofDeparture);
        form1.add(dateofDepartureTextField);
        form1.add(dateofArrival);
        form1.add(dateofArrivalTextField);
        form1.add(cityFrom);
        form1.add(cityFromTextField);
        form1.add(cityTo);
        form1.add(cityToTextField);
        actionPerformed = new InformationFromFormOne();
        conferm.addActionListener(actionPerformed);
        clearConfermation.addActionListener(actionPerformed);
    }

    public static boolean doMatchCity(String cityFrom) {
        return false;
    }


    class InformationFromFormOne implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == conferm){
                    String dateOfDeparture = (dateofDepartureTextField.getText());
                    String dateOfArrival   = (dateofArrivalTextField.getText());
                    String cityFrom   = (cityFromTextField.getText());
                    String cityTo  = (cityToTextField.getText());
                    suggestion = new Suggestion(dateOfDeparture, dateOfArrival, true, cityFrom, cityTo);
                    if(doMatch(dateOfArrival) ){
                        if(doMatch(dateOfDeparture)) {
                            form1.setVisible(false);
                            FormNum2 form2 = new FormNum2();
                        }
                        else{JOptionPane.showMessageDialog(form1, "Date must be in format **/**/****");}
                    }
                    else{JOptionPane.showMessageDialog(form1, "Date must be in format **/**/****");
                    }
                }


                if (e.getSource() == clearConfermation){
                    dateofArrivalTextField.setText(null);
                    dateofDepartureTextField.setText(null);
                    cityFromTextField.setText(null);
                    cityToTextField.setText(null);
                }
            }
         }

}
