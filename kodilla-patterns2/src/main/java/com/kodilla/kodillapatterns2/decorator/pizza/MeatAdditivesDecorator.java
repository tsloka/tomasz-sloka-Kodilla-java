package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class MeatAdditivesDecorator extends AbstractPizzaOrderDecorator {
    public MeatAdditivesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(14));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and meat selection";
    }
}
