package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testShoppingTask() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        Task shoppingTask = tasksFactory.makeTaskDone(TasksFactory.SHOPPING_TASK);
        //When
        String shoppingPurpose = "Go to shop in your area" + "milk";
        shoppingTask.executeTask();
        //Then
        assertEquals(shoppingPurpose, shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());

    }
    @Test
    void testDrivingTask() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        Task drivingTask = tasksFactory.makeTaskDone(TasksFactory.DRIVING_TASK);
        //When
        String drivingPurpose = "journey at the sea" + "Mediterranean coast" + "car";
        drivingTask.executeTask();
        //Then
        assertEquals(drivingPurpose, drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());

    }
    @Test
    void testPaintingTask() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        Task paintingTask = tasksFactory.makeTaskDone(TasksFactory.PAINTING_TASK);
        //When
        String paintingPurpose = "renovation" + "blue" + "wall in your room";
        paintingTask.executeTask();

        //Then
        assertEquals(paintingPurpose, paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());

    }
}
