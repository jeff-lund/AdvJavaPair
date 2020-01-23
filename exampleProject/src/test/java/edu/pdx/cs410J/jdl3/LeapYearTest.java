package edu.pdx.cs410J.jdl3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    @Test
    public void yearIsDivisibleBy400IsLeapYear() {
        assert (LeapYear.isLeapYear(2000));
    }

    @Test
    public void yearIsDivisibleBy100AndNot400IsNotLearYear() {
        assertFalse(LeapYear.isLeapYear(1700));
    }

    @Test
    public void yearIsDivisibleBy4ButNot100IsLeapYear() {
        assert (LeapYear.isLeapYear(2008));
    }

    @Test
    public void yearNotDivisibleByFour() {
        assertFalse(LeapYear.isLeapYear(2019));
    }

    @Test
    public void yearNotDivisibleByFourButIsDivisibleBy100() {
        assertTrue(LeapYear.isLeapYear(2016));
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeYearThrowsException() {
        LeapYear.isLeapYear(-1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroYearThrowsException() {
        LeapYear.isLeapYear(0);
    }

}