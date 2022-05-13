package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList = new TaskList();
    private TaskList doneList = new TaskList();
    private TaskList inProgressList = new TaskList();

    public Board(TaskList toDoList, TaskList doneList, TaskList inProgressList) {
    }


    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }


}
