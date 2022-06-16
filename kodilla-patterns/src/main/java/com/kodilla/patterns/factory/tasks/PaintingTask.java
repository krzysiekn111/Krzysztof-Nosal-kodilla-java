package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    String color;
    String whatToPaint;
    private boolean isTaskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }


    @Override
    public void executeTask() {
        isTaskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName + color + whatToPaint;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
