package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getField() {
        return 3.14d * Math.pow(radius, (int) 2);
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
}
