package com.kodilla.good.patterns.challenges.product.order.service;

public class CarParts extends Product{
    private final String productCategory = "Car parts";

    public CarParts(String productName, String productDescription, float productPrice) {
        super(productName, productDescription, productPrice);
    }

    @Override
    public String getProductCategory() {
        return productCategory;
    }
}
