package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures;

    public ShapeCollector() {
        figures = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public void showFigures() {
        int i = 0;
        for (Shape shape : figures) {
            i++;
            System.out.println("Figure " + i + ": " + shape.getShapeName() + " field equals: " + shape.getField());
        }
    }

    public int figuresCount() {
        return figures.size();
    }
}
