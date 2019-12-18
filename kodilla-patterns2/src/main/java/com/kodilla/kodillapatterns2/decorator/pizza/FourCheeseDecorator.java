package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class FourCheeseDecorator extends AbstractPizzaOrderDecorator {
    public FourCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " four cheese additives()";
    }
}
