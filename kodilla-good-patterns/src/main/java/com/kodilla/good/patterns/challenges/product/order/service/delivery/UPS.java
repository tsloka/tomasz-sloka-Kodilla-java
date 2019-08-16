package com.kodilla.good.patterns.challenges.product.order.service.delivery;

public class UPS implements DeliveryMethod {
    @Override
    public boolean delivery() {
        System.out.println("You chose delivery by UPS.");
        return true;
    }
}
