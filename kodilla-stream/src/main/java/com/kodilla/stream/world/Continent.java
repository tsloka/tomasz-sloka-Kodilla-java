package com.kodilla.stream.world;

import java.util.HashSet;

public final class Continent {
    private HashSet<Country> countries = new HashSet<>();

    public Continent() {
        new HashSet<Country>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public final HashSet<Country> getCountries() {
        return countries;
    }
}
