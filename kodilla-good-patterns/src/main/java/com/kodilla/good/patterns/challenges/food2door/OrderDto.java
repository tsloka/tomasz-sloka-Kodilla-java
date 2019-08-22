package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;

public class OrderDto {
    private HashMap<Integer, Order> database = new HashMap<>();
    private int orderNumber = 0;

    public OrderDto() {
    }

    public void registerOrder (Order order) {
        database.put(++orderNumber,order);
    }
}
