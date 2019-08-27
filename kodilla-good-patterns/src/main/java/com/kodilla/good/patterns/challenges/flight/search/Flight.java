package com.kodilla.good.patterns.challenges.flight.search;

import java.time.LocalDateTime;

public class Flight {
    private Cities from;
    private Cities to;
    private LocalDateTime startingTime;
    private LocalDateTime landingTime;

    public Flight(Cities from, Cities to, LocalDateTime startingTime, LocalDateTime landingTime) {
        this.from = from;
        this.to = to;
        this.startingTime = startingTime;
        this.landingTime = landingTime;
    }

    public Cities getFrom() {
        return from;
    }

    public Cities getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "\nFlight{" +
                "from=" + from +
                ", to=" + to +
                ", startingTime=" + startingTime +
                ", landingTime=" + landingTime +
                '}'+"\n";
    }

    public LocalDateTime getStartingTime() {
        return startingTime;
    }

    public LocalDateTime getLandingTime() {
        return landingTime;
    }
}
