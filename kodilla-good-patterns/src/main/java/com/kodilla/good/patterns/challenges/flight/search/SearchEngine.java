package com.kodilla.good.patterns.challenges.flight.search;

import java.util.List;
import java.util.stream.Collectors;

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
        List<Flight> departureFlights = database.getFlights().stream().filter(s -> s.getFrom().equals(departure))
                .collect(Collectors.toList());
        List<Flight> arrivalFlights = database.getFlights().stream().filter(s -> s.getTo().equals(arrival))
                .collect(Collectors.toList());
        List<SearchResultOneTransfer> results;

        results = departureFlights.stream().flatMap(s->
                arrivalFlights.stream().filter(x -> x.getFrom().equals(s.getTo()))
                .filter(x->x.getStartingTime().isAfter(s.getLandingTime()))
                .map(x -> new SearchResultOneTransfer(s, x))).collect(Collectors.toList());

        results.stream().forEach(System.out::println);
    }
}
