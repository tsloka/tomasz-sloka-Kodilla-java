package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    protected static final String SHOPPING = "SHOPPING";
    protected static final String PAINTING = "PAINTING";
    protected static final String DRIVING = "DRIVING";

    public final Task selectTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Leather belt", 2);
            case PAINTING:
                return new PaintingTask("Painting", "Black", "Panther");
            case DRIVING:
                return new DrivingTask("Driving", "Szczebrzeszyn", "using bicycle");
            default:
                return null;
        }
    }
}