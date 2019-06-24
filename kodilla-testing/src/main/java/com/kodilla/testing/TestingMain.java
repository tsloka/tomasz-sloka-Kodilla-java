package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.*;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(5);
        Shape triangle = new Triangle(2,5,30);
        Shape circle = new Circle(7);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        shapeCollector.showFigures();
    }
}
