package com.company;

/**
 * Created by rinathatipov on 20.07.16.
 */
public class DoubleTicket extends Ticket {
    Ticket firstTicket, secondTicket;
    int price;
    public DoubleTicket(Ticket firstTicket, Ticket secondTicket) {
        this.firstTicket = firstTicket;
        this.secondTicket = secondTicket;
        price = firstTicket.price + secondTicket.price;
    }

    public boolean dataCheck () {
        return firstTicket.dataCheck() && secondTicket.dataCheck() && firstTicket.dateOfArrival.compareTo(secondTicket.dateOfDeparture) < 0;
    }
}