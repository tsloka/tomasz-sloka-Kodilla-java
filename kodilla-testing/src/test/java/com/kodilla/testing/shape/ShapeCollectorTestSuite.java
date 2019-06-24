package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {


    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(3, shapeCollector.figuresCount());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(square);
        shapeCollector.removeFigure(triangle);
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0, shapeCollector.figuresCount());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        Shape retrievedSquare = shapeCollector.getFigure(0);
        Shape retrievedTriangle = shapeCollector.getFigure(1);
        Shape retrievedCircle = shapeCollector.getFigure(2);

        //Then
        Assert.assertEquals(square, retrievedSquare);
        Assert.assertEquals(triangle, retrievedTriangle);
        Assert.assertEquals(circle, retrievedCircle);

    }

    @Test
    public void testGetField() {
        //Given
        Shape square = new Square(2);
        Shape triangle = new Triangle(2, 2, 90);
        Shape circle = new Circle(2);

        //When
        double squareField = square.getField();
        double triangleField = triangle.getField();
        double circleField = circle.getField();

        //Then
        Assert.assertEquals(4, squareField, 0.00001);
        Assert.assertEquals(2, triangleField, 0.00001);
        Assert.assertEquals(12.56d, circleField, 0.00001);

    }
}