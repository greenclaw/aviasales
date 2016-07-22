package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rinathatipov on 19.07.16.
 */
public class FormNum3 extends JFrame {

    public static final Pattern pattern = Pattern.compile
            ("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    public static boolean doMatch(String word) {
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }

    public static boolean doMatch1(String word) {
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }


    static JFrame form3 = new JFrame("form3");
    JButton conferm;
    JTextField email,numberOfCard,name,secondName;
    JLabel emailLabel, numberOfCardLabel, nameLabel, secondNameLabel, ticket1;
    static Travaler travaler;
    static Ticket ticket = FormNum2.selectedTicket;
    ActionListener actionPerformed;

    public FormNum3() {
        form3.setSize(520, 600);
        form3.setResizable(false);
        form3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form3.setLocationRelativeTo(null);
        form3.setLocationRelativeTo(null);
        form3.setLayout(new FlowLayout());
        form3.setVisible(true);
        
        ticket1 = new JLabel(FormNum2.selectedTicket.cityFrom + " " + FormNum2.selectedTicket.cityTo + " " + FormNum2.selectedTicket.price);
        emailLabel = new JLabel("Your email");
        email = new JTextField(10);

        numberOfCardLabel = new JLabel("Your card number");
        numberOfCard = new JTextField(10);

        nameLabel = new JLabel("Your name");
        name = new JTextField(10);

        secondNameLabel = new JLabel("Your second name");
        secondName = new JTextField(10);

        conferm = new JButton("Conferm Information");

        form3.add(nameLabel);
        form3.add(name);

        form3.add(secondNameLabel);
        form3.add(secondName);

        form3.add(emailLabel);
        form3.add(email);

        form3.add(numberOfCardLabel);
        form3.add(numberOfCard);

        form3.add(conferm);

        actionPerformed = new FormNum3.InformationFromFormThree();
        conferm.addActionListener(actionPerformed);
    }
    class InformationFromFormThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == conferm) {
                String email1 = (email.getText());
                String secondName1 = (secondName.getText());
                String name1 = (name.getText());
                String numberOfCard1 = (numberOfCard.getText());
                travaler = new Travaler(email1, numberOfCard1, name1, secondName1, ticket);
            }
        }
    }
}