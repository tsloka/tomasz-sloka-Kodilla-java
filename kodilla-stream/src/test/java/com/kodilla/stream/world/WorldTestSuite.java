package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country(new BigDecimal("38476269"));
        Country germany = new Country(new BigDecimal("80594017"));
        Country greatBritain = new Country(new BigDecimal("64769452"));
        Country unitedStates = new Country(new BigDecimal("326625791"));
        Country canada = new Country(new BigDecimal("35623680"));
        Country mexico = new Country(new BigDecimal("124574795"));
        Country china = new Country(new BigDecimal("1379302771"));
        Country india = new Country(new BigDecimal("1281935911"));
        Country nigeria = new Country(new BigDecimal("190632261"));
        Country ethiopia = new Country(new BigDecimal("98665000"));
        Continent europe = new Continent();
        Continent northAmerica = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        World world = new World();

        //When
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(greatBritain);
        northAmerica.addCountry(unitedStates);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);
        asia.addCountry(china);
        asia.addCountry(india);
        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(africa);
        BigDecimal peopleQuantity = new BigDecimal("3621199947");

        //Then
        Assert.assertEquals(peopleQuantity, world.getPeopleQuantity());

    }
}
