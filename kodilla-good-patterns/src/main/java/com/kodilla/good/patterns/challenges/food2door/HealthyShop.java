package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends EverySupplier implements FoodSupplier {

    public HealthyShop(String supplierName, int productQuantity, String productName) {
        super(supplierName, productQuantity, productName);
    }

    @Override
    public boolean process() {
        System.out.println("HealthyShop will deliver its products");
        return true;
    }
}
