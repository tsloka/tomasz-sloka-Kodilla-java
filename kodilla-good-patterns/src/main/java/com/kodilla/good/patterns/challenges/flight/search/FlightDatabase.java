package com.kodilla.good.patterns.challenges.flight.search;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class FlightDatabase {
    List<Flight> allFlights = new LinkedList<>();

    public FlightDatabase() {
        allFlights.add(new Flight(Cities.BERLIN, Cities.KRAKOW,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.GDANSK, Cities.KRAKOW,
                LocalDateTime.now(), LocalDateTime.now().plusHours(1)));
        allFlights.add(new Flight(Cities.KRAKOW, Cities.WARSZAWA,
                LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        allFlights.add(new Flight(Cities.WROCLAW, Cities.GDANSK,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.WARSZAWA, Cities.WROCLAW,
                LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        allFlights.add(new Flight(Cities.PARYZ, Cities.BERLIN,
                LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        allFlights.add(new Flight(Cities.BERLIN, Cities.KRAKOW,
                LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        allFlights.add(new Flight(Cities.WARSZAWA, Cities.BERLIN,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.WROCLAW, Cities.GDANSK,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.PARYZ, Cities.WROCLAW,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.WROCLAW, Cities.KRAKOW,
                LocalDateTime.now().plusHours(5), LocalDateTime.now().plusHours(6)));
        allFlights.add(new Flight(Cities.BERLIN, Cities.KRAKOW,
                LocalDateTime.now().plusHours(5), LocalDateTime.now().plusHours(6)));

    }

    public List<Flight> getFlights() {
        return allFlights;
    }
}
