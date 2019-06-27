package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class Country {
    private final BigDecimal peopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public final BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
