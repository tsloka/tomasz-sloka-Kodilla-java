package com.kodilla.good.patterns.challenges.food2door;

public abstract class EverySupplier implements FoodSupplier {
    private Suppliers supplierName;
    private String product;

    public EverySupplier(Suppliers supplierName, String product) {
        this.supplierName = supplierName;
        this.product = product;
    }

    public void createNewOrder(Order order) {
    }

    public Suppliers getSupplierName() {
        return supplierName;
    }

    public String getProduct() {
        return product;
    }
}
