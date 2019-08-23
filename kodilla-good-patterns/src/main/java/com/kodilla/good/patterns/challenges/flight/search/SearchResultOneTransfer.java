package com.kodilla.good.patterns.challenges.flight.search;

public class SearchResultOneTransfer {
    private Flight firstFlight;
    private Flight secondFlight;

    public SearchResultOneTransfer(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public void setFirstFlight(Flight firstFlight) {
        this.firstFlight = firstFlight;
    }

    public void setSecondFlight(Flight secondFlight) {
        this.secondFlight = secondFlight;
    }

    @Override
    public String toString() {
        return "SearchResultOneTransfer{" +
                "firstFlight=" + firstFlight +
                ", \nsecondFlight=" + secondFlight +
                '}';
    }
}
