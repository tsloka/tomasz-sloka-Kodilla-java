package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiiAdditivesDecorator extends AbstractPizzaOrderDecorator {

    public HawaiiAdditivesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Hawaii additives";
    }
}
