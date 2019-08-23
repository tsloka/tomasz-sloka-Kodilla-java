package com.kodilla.good.patterns.challenges.flight.search;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class FlightDatabase {
    List<Flight> allFlights = new LinkedList<>();

    public FlightDatabase() {
        allFlights.add(new Flight(Cities.BERLIN, Cities.KRAKÓW,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.GDAŃSK, Cities.KRAKÓW,
                LocalDateTime.now(), LocalDateTime.now().plusHours(1)));
        allFlights.add(new Flight(Cities.KRAKÓW, Cities.WARSZAWA,
                LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        allFlights.add(new Flight(Cities.WROCŁAW, Cities.GDAŃSK,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.WARSZAWA, Cities.WROCŁAW,
                LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        allFlights.add(new Flight(Cities.PARYŻ, Cities.BERLIN,
                LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        allFlights.add(new Flight(Cities.BERLIN, Cities.KRAKÓW,
                LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        allFlights.add(new Flight(Cities.WARSZAWA, Cities.BERLIN,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.WROCŁAW, Cities.GDAŃSK,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.PARYŻ, Cities.WROCŁAW,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(4)));
        allFlights.add(new Flight(Cities.WROCŁAW, Cities.KRAKÓW,
                LocalDateTime.now().plusHours(5), LocalDateTime.now().plusHours(6)));
        allFlights.add(new Flight(Cities.BERLIN, Cities.KRAKÓW,
                LocalDateTime.now().plusHours(5), LocalDateTime.now().plusHours(6)));

    }

    public List<Flight> getFlights() {
        return allFlights;
    }
}
