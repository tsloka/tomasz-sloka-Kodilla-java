package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> figures = new ArrayList<>();

    public ShapeCollector() {

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
        figures.toString();
    }

    public int figuresCount() {
        return figures.size();
    }
}
