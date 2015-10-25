package com.taringamberini.linuxday2015;

/**
 * @author Tarin Gamberini - www.taringamberini.com
 */
public class Ticket {

    private final double ticketPrice;

    public Ticket(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getPrice(int age) {
        if (age < 12) {
            return 5.0;
        }
        if (age > 70) {
            return ticketPrice / 2;
        }
        return ticketPrice;
    }

}
