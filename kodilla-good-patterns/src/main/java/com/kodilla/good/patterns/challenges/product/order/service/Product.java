package com.kodilla.good.patterns.challenges.product.order.service;

public class Product {
    private String productCategory;
    private String productName;
    private String productDescription;
    private float productPrice;

    public Product(String productName, String productDescription, float productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public float getProductPrice() {
        return productPrice;
    }
}
