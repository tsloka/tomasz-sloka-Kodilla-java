package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends EverySupplier implements FoodSupplier {
    public ExtraFoodShop(String supplierName, int productQuantity, String productName) {
        super(supplierName, productQuantity, productName);
    }

    @Override
    public boolean process() {
        System.out.println("ExtraFoodShop will deliver soi beans.");
        return true;
    }
}
