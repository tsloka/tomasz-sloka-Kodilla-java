package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args) {
        FlightSearcher searcher = new FlightSearcher();
        Flight gdanskToWroclaw = new Flight("Gdansk", "Wroclaw");
        Flight warsawToWroclaw = new Flight("Warsaw", "Wroclaw");
        Flight berlinToRzeszow = new Flight("Berlin", "Rzeszow");

        try {
            searcher.findFlight(gdanskToWroclaw);
        } catch (Exception e) {
            System.out.println("There were some mistakes during application execution: \n"
                    + e + "\n but we handled them :D");
        }
        try {
            searcher.findFlight(warsawToWroclaw);
        } catch (Exception e) {
            System.out.println("There were some mistakes during application execution: \n"
                    + e + "\n but we handled them :D");
        }
        try {
            searcher.findFlight(berlinToRzeszow);
        } catch (Exception e) {
            System.out.println("There were some mistakes during application execution: \n"
                    + e + "\n but we handled them :D");
        } finally {
            System.out.println("See you next time, our app is the best...");
        }
    }
}
