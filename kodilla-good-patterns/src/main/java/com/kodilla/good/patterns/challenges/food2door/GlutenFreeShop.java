package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends EverySupplier implements FoodSupplier {
    public GlutenFreeShop (Suppliers supplierName, String product) {
        super(supplierName, product);
    }

    @Override
    public boolean process(Order order) {
        return true;
    }

    @Override
    public void sendNotification() {
        System.out.println("Gluten Free Shop was notified.");
    }

    @Override
    public void orderDelivery() {
        System.out.println("Gluten Free Shop will deliver its products with courier package.");
    }
}
