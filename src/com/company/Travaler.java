package com.company;

import javax.swing.*;

/**
 * Created by rinathatipov on 21.07.16.
 */
public class Travaler {
    String mail;
    String numberOfCard;
    String name;
    String secondName;
    Ticket ticket;

    public Travaler(String mail, String numberOfCard, String name, String secondName, Ticket ticket) {
        this.mail = mail;
        this.numberOfCard = numberOfCard;
        this.name = name;
        this.secondName = secondName;
        this.ticket = ticket;
    }
}
