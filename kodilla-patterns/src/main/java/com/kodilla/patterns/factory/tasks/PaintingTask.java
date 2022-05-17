package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;

    PaintingTask(String taskName, String color, String whatToPaint) {

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
        return null;
    }
}
