package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList doneList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList toDoList;

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean
    public Board getBoard() {
        return new Board(inProgressList, doneList, toDoList);
    }
}
