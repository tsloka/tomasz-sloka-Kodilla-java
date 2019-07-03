package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;

public final class World {
    private HashSet<Continent> world;

    public World() {
        world = new HashSet<>();
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, peopleQuantity) -> sum = sum.add(peopleQuantity));
    }

    public void addContinent(Continent continent) {
        world.add(continent);
    }
}