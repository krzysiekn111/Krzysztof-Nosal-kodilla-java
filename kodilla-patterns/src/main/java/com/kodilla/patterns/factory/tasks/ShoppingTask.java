package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    ShoppingTask(String taskName, String whatToBuy, double quantity) {

    }

    @Override
    public String executeTask() {
        return "You have arrived at your destination";
    }

    @Override
    public String getTaskName() {
        return "Road to the sea";
    }

    @Override
    public Boolean isTaskExecuted() {
        return null;
    }
}
