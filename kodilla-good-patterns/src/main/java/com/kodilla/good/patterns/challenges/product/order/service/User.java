package com.kodilla.good.patterns.challenges.product.order.service;

public class User {
    private final String username;
    private final String name;
    private final String surname;
    private final String address;
//    private final List<> orders;

    public User(String username, String name, String surname, String address) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }


}
