package com.company;

/**
 * Created by rinathatipov on 17.07.16.
 */
public class Suggestion {
    String dateOfDeparture;
    String dateOfArrival;
    Boolean roundTrip;
    String cityFrom;
    String cityTo;

    public Suggestion(String dateOfDeparture, String dateOfArrival, Boolean roundTrip, String cityFrom, String cityTo) {
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.roundTrip = roundTrip;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }
}
