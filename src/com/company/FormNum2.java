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
    Ticket[] tickets;
    JButton[] buttons;
    public FormNum2() throws java.lang.InterruptedException{
        form2.setSize(1200,600);
            //frame.setResizable(false);
        form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form2.setLocationRelativeTo(null);
        form2.setLocationRelativeTo(null);
        form2.setLayout(new FlowLayout());
        int countOfTickets = 0;
        countOfTickets = SelectTicket.getCount();
        JLabel[] ticketsLables = new JLabel[SelectTicket.getCount()];
        ticketsLables[0] = new JLabel();
        tickets = new Ticket[SelectTicket.getCount()];
        buttons = new JButton[SelectTicket.getCount()];
        buttons[0] = new JButton();
        tickets = SelectTicket.getTicket();
        Thread.sleep(1000);

        for(int i = 0;i<SelectTicket.getCount();i++)
        {
            ticketsLables[i] = new JLabel(tickets[i].dateOfDeparture + "  " + tickets[i].dateOfDeparture + "  " + tickets[i].cityFrom + "  " + tickets[i].cityTo);
            buttons[i]= new JButton("Button "+ i);
            form2.add(ticketsLables[i]);
            form2.add(buttons[i]);
        }

        // ticket1 = new JLabel(oneTicket.dateOfDeparture + " " + oneTicket.dateOfArrival + " " + oneTicket.cityFrom + " " + oneTicket.cityTo);
       // conferm = new JButton("Bue this ticket");
        form2.setVisible(true);
       // form2.add(conferm);
        actionPerformed = new SelectedTicket();
        for(int i = 0;i<SelectTicket.getCount();i++)
        {
            buttons[i].addActionListener(actionPerformed);
        }


       // conferm.addActionListener(actionPerformed);
        }

    class SelectedTicket implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(int i = 0;i<SelectTicket.getCount();i++) {
                if (e.getSource() == buttons[i]) {
                    String dateOfDeparture = (oneTicket.dateOfDeparture);
                    String dateOfArrival = (oneTicket.dateOfArrival);
                    String cityFrom = (oneTicket.cityFrom);
                    String cityTo = (oneTicket.cityTo);
                    selectedTicket = new Ticket(400, dateOfDeparture, dateOfArrival, true, cityFrom, cityTo);
                    form2.setVisible(false);
                    FormNum3 form3 = new FormNum3();
                    break;
                }
            }

}
    }
}


