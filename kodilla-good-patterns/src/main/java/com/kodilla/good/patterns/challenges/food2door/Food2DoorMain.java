package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorMain {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(Suppliers.ExtraFoodShop, "Soy beans");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(Suppliers.GlutenFreeShop, "Gluten free lamb");
        HealthyShop healthyShop = new HealthyShop(Suppliers.HealthyShop, "Healthy muesli");
        OrderDto dto = new OrderDto();
        Order order1 = new Order(extraFoodShop,3);
        Order order2 = new Order(glutenFreeShop,5);
        Order order3 = new Order(healthyShop, 7);

        order1.createOrder(order1);
        order2.createOrder(order2);
        order3.createOrder(order3);
        dto.registerOrder(order1);
        dto.registerOrder(order2);
        dto.registerOrder(order3);

    }
}
