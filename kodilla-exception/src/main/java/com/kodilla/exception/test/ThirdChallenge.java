package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void catchmessage(Exception e) {
        System.out.println("There wes a mistake during application execution: \n"
                + e + "\n but we handled it.");
    }

    public static void main(String[] args) {

        FlightSearcher searcher = new FlightSearcher();
        Flight gdanskToWroclaw = new Flight("Gdansk", "Wroclaw");
        Flight warsawToWroclaw = new Flight("Warsaw", "Wroclaw");
        Flight berlinToRzeszow = new Flight("Berlin", "Rzeszow");

        try {
            searcher.findFlight(gdanskToWroclaw);
        } catch (Exception e) {
            catchmessage(e);
        }
        try {
            searcher.findFlight(warsawToWroclaw);
        } catch (Exception e) {
            catchmessage(e);
        }
        try {
            searcher.findFlight(berlinToRzeszow);
        } catch (Exception e) {
            catchmessage(e);
        } finally {
            System.out.println("See you next time...");
        }
    }
}
