package com.kodilla.good.patterns.challenges.flight.search;

import java.util.LinkedList;
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
        List<SearchResultOneTransfer> results = new LinkedList<>();

        departureFlights.stream().forEach(s -> new SearchResultOneTransfer(s,
                        arrivalFlights.stream().filter(x -> x.getFrom().equals(s.getTo())).
                                filter(x->x.getStartingTime().isAfter(s.getLandingTime())).findAny().orElse(null)));

        results = departureFlights.stream().map(s->new SearchResultOneTransfer(s,arrivalFlights.stream().filter(x -> x.getFrom().equals(s.getTo())).
                filter(x->x.getStartingTime().isAfter(s.getLandingTime())).findFirst()));

//        for (Flight flight : departureFlights) {
//            arrivalFlights.stream().filter(s -> s.getFrom().equals(flight.getTo()))
//                    .filter(s -> s.getStartingTime().isAfter(flight.getLandingTime()))
//                    .forEach(s -> results.add(new SearchResultOneTransfer(flight, s)));
//        }
        results.stream().forEach(System.out::println);
    }
}
