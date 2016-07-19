package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rinathatipov on 18.07.16.
 */
public class FormNum2 extends JFrame{
    static JFrame form2 = new JFrame("form2");
    Ticket oneTicket = new Ticket(400, FormNum1.suggestion.dateOfDeparture ,FormNum1.suggestion.dateOfArrival, false, FormNum1.suggestion.cityFrom, FormNum1.suggestion.cityTo);
    JButton conferm;
    static Ticket selectedTicket;
    JLabel ticket1;
    ActionListener actionPerformed;
    public FormNum2()  {
        form2.setSize(1200,600);
            //frame.setResizable(false);
        form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form2.setLocationRelativeTo(null);
        form2.setLocationRelativeTo(null);
        form2.setLayout(new FlowLayout());
        ticket1 = new JLabel(oneTicket.dateOfDeparture + " " + oneTicket.dateOfArrival + " " + oneTicket.cityFrom + " " + oneTicket.cityTo);
        conferm = new JButton("Bue this ticket");
        form2.setVisible(true);
        form2.add(ticket1);
        form2.add(conferm);
        actionPerformed = new SelectedTicket();
        conferm.addActionListener(actionPerformed);
        }

    class SelectedTicket implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == conferm){
                String dateOfDeparture = (oneTicket.dateOfDeparture);
                String dateOfArrival   = (oneTicket.dateOfArrival);
                String cityFrom   = (oneTicket.cityFrom);
                String cityTo  = (oneTicket.cityTo);
                selectedTicket = new Ticket(400,dateOfDeparture, dateOfArrival, true,  cityFrom, cityTo);
                form2.setVisible(false);
                FormNum3 form3 = new FormNum3();
            }


}
    }}


