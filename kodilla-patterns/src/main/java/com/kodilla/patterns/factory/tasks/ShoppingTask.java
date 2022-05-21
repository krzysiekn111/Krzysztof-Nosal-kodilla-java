package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;

    ShoppingTask(String taskName, String whatToBuy, double quantity) {

    }

    @Override
    public String executeTask() {
        return "You have arrived at your destination";
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
