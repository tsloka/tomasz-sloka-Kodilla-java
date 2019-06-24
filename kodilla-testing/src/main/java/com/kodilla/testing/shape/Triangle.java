package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double angle;

    public Triangle() {

    }

    public Triangle(double sideA, double sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    @Override
    public double getField() {
        return sideA * sideB * Math.sin(angle / 360 * 2 * 3.14d) / 2;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
}
