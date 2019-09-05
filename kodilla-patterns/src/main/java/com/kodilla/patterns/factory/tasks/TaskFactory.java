package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    protected static TaskType taskType;

    public final Task selectTask(final TaskType taskType) {
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