package com.kodilla.good.patterns.challenges.flight.search;

import java.util.LinkedList;
import java.util.List;

public class SearchEngine {

    public SearchEngine() {
    }

    public void findDeparting(Cities city, FlightDatabase database) {
        database.getFlights().stream().filter(s -> s.getFrom().equals(city)).forEach(System.out::println);
    }

    public void findArriving(Cities city, FlightDatabase database) {
        database.getFlights().stream().filter(s -> s.getTo().equals(city)).forEach(System.out::println);
    }

    public void findWithOneTransfer(Cities departure, Cities arrival, FlightDatabase database) {
        List<Flight> departureFlights = new LinkedList<>();
        database.getFlights().stream().filter(s -> s.getFrom().equals(departure))
                .forEach(departureFlights::add);
        List<Flight> arrivalFlights = new LinkedList<>();
        database.getFlights().stream().filter(s -> s.getTo().equals(arrival))
                .forEach(arrivalFlights::add);
        List<SearchResultOneTransfer> results = new LinkedList<>();

        for (Flight flight : departureFlights) {
            arrivalFlights.stream().filter(s -> s.getFrom().equals(flight.getTo()))
                    .filter(s->s.getStartingTime().isAfter(flight.getLandingTime()))
                    .forEach(s->results.add(new SearchResultOneTransfer(flight,s)));
        }
        for (SearchResultOneTransfer result : results){
            System.out.println(result);
        }
    }
}
