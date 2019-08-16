package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends EverySupplier implements FoodSupplier {
    public GlutenFreeShop (String supplierName, int productQuantity, String productName) {
        super(supplierName, productQuantity, productName);
    }

    @Override
    public boolean process() {
        System.out.println("GlutenFreeShop will deliver something.");
        return true;
    }
}
