package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends EverySupplier implements FoodSupplier {
    public HealthyShop (Suppliers supplierName, String product) {
        super(supplierName, product);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("HealthyShop will deliver its product");
        return true;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email message was sent to supplier with specified order.");
    }

    @Override
    public void orderDelivery() {
        System.out.println("Delivery method has been chosen.");
    }
}
