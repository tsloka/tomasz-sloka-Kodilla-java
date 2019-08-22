package com.kodilla.good.patterns.challenges.food2door;

public interface FoodSupplier {
    public boolean process(Order order);
    public void sendNotification();
    public void orderDelivery();
}
