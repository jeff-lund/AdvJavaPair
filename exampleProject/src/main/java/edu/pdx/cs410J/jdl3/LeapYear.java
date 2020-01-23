package edu.pdx.cs410J.jdl3;

public class LeapYear {
    public static void main(String[] args) {
        System.exit(0);
    }

    public static boolean isLeapYear(int year) throws IllegalArgumentException {
        if (year < 1) {
            throw new IllegalArgumentException("Year must be positive");
        }

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
