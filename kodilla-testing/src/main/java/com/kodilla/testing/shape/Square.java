package com.kodilla.testing.shape;

public class Square implements Shape {
    double sideLenght;

    public Square() {

    }

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public double getField() {
        return Math.pow(sideLenght, (int) 2);
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
}
