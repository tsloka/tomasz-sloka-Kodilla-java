package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;

public final class World {
    private HashSet<Continent> world;
    private BigDecimal quantity;

    public World() {
        world = new HashSet<Continent>();
        quantity = BigDecimal.ZERO;
    }

    public BigDecimal getPeopleQuantity() {
        quantity = world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, peopleQuantity) -> sum = sum.add(peopleQuantity));
        return quantity;
    }

    public void addContinent(Continent continent) {
        world.add(continent);
    }
}
