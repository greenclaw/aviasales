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
    Ticket firstTicket = SelectTicket.getTicket(1);
    Ticket secondTicket = SelectTicket.getTicket(2);
    Ticket thirdTicket = SelectTicket.getTicket(3);
    JButton conferm1;
    JButton conferm2;
    JButton conferm3;
    static Ticket selectedTicket;
    JLabel ticket1;
    JLabel ticket2;
    JLabel ticket3;
    ActionListener actionPerformed;
    public FormNum2()  {
        form2.setSize(1200,600);
            //frame.setResizable(false);
        form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form2.setLocationRelativeTo(null);
        form2.setLocationRelativeTo(null);
        form2.setLayout(new FlowLayout());
        ticket1 = new JLabel(firstTicket.dateOfDeparture + " " + firstTicket.dateOfArrival + " " + firstTicket.cityFrom + " " + firstTicket.cityTo);
        conferm1 = new JButton("Bue this ticket");
        ticket2 = new JLabel(secondTicket.dateOfDeparture + " " + secondTicket.dateOfArrival + " " + secondTicket.cityFrom + " " + secondTicket.cityTo);
        conferm2 = new JButton("Bue this ticket");
        ticket1 = new JLabel(thirdTicket.dateOfDeparture + " " + thirdTicket.dateOfArrival + " " + thirdTicket.cityFrom + " " + thirdTicket.cityTo);
        conferm3 = new JButton("Bue this ticket");
        form2.setVisible(true);

        form2.add(ticket1);
        form2.add(conferm1);

        form2.add(ticket2);
        form2.add(conferm2);

        form2.add(ticket3);
        form2.add(conferm3);

        actionPerformed = new SelectedTicket();
        conferm1.addActionListener(actionPerformed);
        }

    class SelectedTicket implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == conferm1){
                String dateOfDeparture = (firstTicket.dateOfDeparture);
                String dateOfArrival   = (firstTicket.dateOfArrival);
                String cityFrom   = (firstTicket.cityFrom);
                String cityTo  = (firstTicket.cityTo);
                selectedTicket = new Ticket(400,dateOfDeparture, dateOfArrival, true,  cityFrom, cityTo);
                form2.setVisible(false);
                FormNum3 form3 = new FormNum3();
            }

            if (e.getSource() == conferm2){
                String dateOfDeparture = (secondTicket.dateOfDeparture);
                String dateOfArrival   = (secondTicket.dateOfArrival);
                String cityFrom   = (secondTicket.cityFrom);
                String cityTo  = (secondTicket.cityTo);
                selectedTicket = new Ticket(400,dateOfDeparture, dateOfArrival, true,  cityFrom, cityTo);
                form2.setVisible(false);
                FormNum3 form3 = new FormNum3();
            }

            if (e.getSource() == conferm3){
                String dateOfDeparture = (thirdTicket.dateOfDeparture);
                String dateOfArrival   = (thirdTicket.dateOfArrival);
                String cityFrom   = (thirdTicket.cityFrom);
                String cityTo  = (thirdTicket.cityTo);
                selectedTicket = new Ticket(400,dateOfDeparture, dateOfArrival, true,  cityFrom, cityTo);
                form2.setVisible(false);
                FormNum3 form3 = new FormNum3();
            }


}
    }}


