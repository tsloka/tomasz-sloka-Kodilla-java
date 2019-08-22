package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends EverySupplier implements FoodSupplier {
    public ExtraFoodShop(Suppliers supplierName, String product) {
        super(supplierName, product);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("ExtraFoodShop will deliver soi beans.");
        return true;
    }

    @Override
    public void sendNotification() {
        System.out.println("Extra Food Shop was notified.");
    }

    @Override
    public void orderDelivery() {
        System.out.println("Extra Food Shop will send product by US Post Airmail.");
    }

}
