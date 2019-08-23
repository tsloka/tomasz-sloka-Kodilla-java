package com.kodilla.good.patterns.challenges.flight.search;

public class SearchMain {
    public static void main(String[] args) {
        FlightDatabase database = new FlightDatabase();
        SearchEngine search = new SearchEngine();

        search.findArriving(Cities.WROCŁAW, database);
        search.findDeparting(Cities.BERLIN, database);
        search.findWithOneTransfer(Cities.PARYŻ, Cities.KRAKÓW, database);
    }
}
