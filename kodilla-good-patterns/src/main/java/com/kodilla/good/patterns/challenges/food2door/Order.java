package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private EverySupplier supplier;
    private String productName;
    private int orderNumber;
    private int productQuantity;

    public Order(EverySupplier supplier, int productQuantity) {
        this.supplier = supplier;
        productName = supplier.getProduct();
        this.productQuantity = productQuantity;
    }

    public void createOrder(Order order) {
        supplier.process(order);
        System.out.println(order.toString());
        supplier.sendNotification();
        supplier.orderDelivery();
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", orderNumber=" + orderNumber +
                ", supplier=" + supplier +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
