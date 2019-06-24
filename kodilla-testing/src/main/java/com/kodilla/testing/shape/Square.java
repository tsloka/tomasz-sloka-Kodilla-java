package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideLength;

    public Square() {

    }

    public Square(double sideLenght) {
        this.sideLength = sideLenght;
    }

    @Override
    public double getField() {
        return Math.pow(sideLength, (int) 2);
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
}
