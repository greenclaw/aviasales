package com.company;

/**
 * Created by rinathatipov on 19.07.16.
 */
public class Ticket {
    int price;
    String dateOfDeparture;
    String dateOfArrival;
    Boolean roundTrip;
    String cityFrom;
    String cityTo;

    public Ticket(int price, String dateOfDeparture, String dateOfArrival, Boolean roundTrip, String cityFrom, String cityTo) {
        this.price = price;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.roundTrip = roundTrip;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }
}
