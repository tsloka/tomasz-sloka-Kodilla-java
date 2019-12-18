package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Regular pizza with tomato sauce and mozzarella", description);
    }

    @Test
    public void testHawaiiPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiAdditivesDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testHawaiiPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiAdditivesDecorator(theOrder);
        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Regular pizza with tomato sauce and mozzarella Hawaii additives", description);
    }

    @Test
    public void testThickDoughMeatPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThickDoughDecorator(theOrder);
        theOrder = new MeatAdditivesDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(34), theCost);
    }

    @Test
    public void testThickDoughMeatOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThickDoughDecorator(theOrder);
        theOrder = new MeatAdditivesDecorator(theOrder);
        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Regular pizza with tomato sauce " +
                "and mozzarella + thick dough and meat selection", description);
    }

    @Test
    public void testCheeseMadnessPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDoughEdgesDecorator(theOrder);
        theOrder = new FourCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testCheeseMadnessPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDoughEdgesDecorator(theOrder);
        theOrder = new FourCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Regular pizza with tomato sauce " +
                "and mozzarella cheese edges four cheese additives()", description);
    }
}
