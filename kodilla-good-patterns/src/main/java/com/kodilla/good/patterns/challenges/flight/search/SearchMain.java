package com.kodilla.good.patterns.challenges.flight.search;

public class SearchMain {
    public static void main(String[] args) {
        FlightDatabase database = new FlightDatabase();
        SearchEngine search = new SearchEngine();

        search.findArriving(Cities.WROCLAW, database);
        search.findDeparting(Cities.BERLIN, database);
        search.findWithOneTransfer(Cities.PARYZ, Cities.KRAKOW, database);
    }
}
