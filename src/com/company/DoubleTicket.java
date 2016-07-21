package com.company;

/**
 * Created by rinathatipov on 20.07.16.
 */
public class DoubleTicket extends Ticket {
    Ticket firstTicket, secondTicket;
    public DoubleTicket (Ticket firstTicket, Ticket secondTicket) {
        this.firstTicket = firstTicket;
        this.secondTicket = secondTicket;
    }
}
