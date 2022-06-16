package com.kodilla.patterns.factory.tasks;

public class TasksFactory {
    public static final String SHOPPING_TASK = "Shopping task";
    public static final String PAINTING_TASK = "Painting task";
    public static final String DRIVING_TASK = "Driving task";

    public final Task makeTaskDone(final String taskType) {
        switch (taskType) {
            case SHOPPING_TASK:
                return new ShoppingTask("Go to shop in your area", "milk", 2 );
            case PAINTING_TASK:
                return new PaintingTask("renovation", "blue", "wall in your room");
            case DRIVING_TASK:
                return new DrivingTask("journey at the sea", "Mediterranean coast", "car");
            default:
                return null;
        }

    }
}
