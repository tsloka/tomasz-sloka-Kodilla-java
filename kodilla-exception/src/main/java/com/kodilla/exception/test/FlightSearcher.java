package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        //Create map of airports
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", false);
        airports.put("Wroclaw", true);
        airports.put("Cracow", false);
        airports.put("Gdansk", true);
        //Logic
        String depAirport = flight.getDepartureAirport();
        String arrAirport = flight.getArrivalAirport();

        if (airports.containsKey(depAirport) & airports.containsKey(arrAirport)) {
            if (airports.get(depAirport) && airports.get(arrAirport)) {
                System.out.println("Flight from " + depAirport + " to " + arrAirport + " was created.");
            } else {
                if (airports.get(depAirport)) {
                    throw new RouteNotFoundException("Arrival airport is currently not accessible.");
                } else {
                    throw new RouteNotFoundException("Departure airport is currently closed.");
                }
            }
        } else {
            throw new RouteNotFoundException("No such airport in database.");
        }
    }
}
