package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;


    DrivingTask(String taskName, String where, String using) {

    }

    @Override
    public String executeTask() {
        return null;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return true;
    }
}
