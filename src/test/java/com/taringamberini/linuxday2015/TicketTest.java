package com.taringamberini.linuxday2015;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Tarin Gamberini - www.taringamberini.com
 */
public class TicketTest {

    @Test
    public void testGetPrice_withAge11() {
        System.out.println("getPrice11");
        Ticket ticket = new Ticket(8.0);
        int age = 11;
        Double expResult = 5.0;

        Double result = ticket.getPrice(age);
        assertEquals(expResult, result);
    }
//
//  Better testing withAge12 and withAge70
//
//    @Test
//    public void testGetPrice_withAge18() {
//        System.out.println("getPrice18");
//        Ticket ticket = new Ticket(8.0);
//        int age = 18;
//        Double expResult = 8.0;
//
//        Double result = ticket.getPrice(age);
//        assertEquals(expResult, result);
//    }

    @Test
    public void testGetPrice_withAge12() {
        System.out.println("getPrice12");
        Ticket ticket = new Ticket(8.0);
        int age = 12;
        Double expResult = 8.0;

        Double result = ticket.getPrice(age);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPrice_withAge71() {
        System.out.println("getPrice71");
        Ticket ticket = new Ticket(8.0);
        int age = 71;
        Double expResult = 4.0;

        Double result = ticket.getPrice(age);
        assertEquals(expResult, result);
    }
    
//    
//    I've mistakenly introduced a bug in my test:
//    my index finger hits the 4 key instead of
//    the 7 key on the numeric keypad.
//
//    @Test
//    public void testGetPrice_withAge70() {
//        System.out.println("getPrice70");
//        Ticket ticket = new Ticket(8.0);
//        int age = 40;
//        Double expResult = 8.0;
//
//        Double result = ticket.getPrice(age);
//        assertEquals(expResult, result);
//    }

    @Test
    public void testGetPrice_withAge70() {
        System.out.println("getPrice70");
        Ticket ticket = new Ticket(8.0);
        int age = 70;
        Double expResult = 8.0;

        Double result = ticket.getPrice(age);
        assertEquals(expResult, result);
    }
}
