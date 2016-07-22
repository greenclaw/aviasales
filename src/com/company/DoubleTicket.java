package com.company;

/**
 * Created by rinathatipov on 20.07.16.
 */
public class DoubleTicket extends Ticket {
    
    int price;
    public DoubleTicket(Ticket firstTicket, Ticket secondTicket) {
        this.firstTicket = firstTicket;
        this.secondTicket = secondTicket;
        //price = firstTicket.price + secondTicket.price;
    }

    public boolean dataCheck (String date) {
        return firstTicket.dataCheck(date) && secondTicket.dataCheck(date) && firstTicket.dateOfArrival.compareTo(secondTicket.dateOfDeparture) < 0;
    }
}