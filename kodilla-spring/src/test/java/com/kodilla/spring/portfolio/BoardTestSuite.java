package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration
public class BoardTestSuite {
    @Test
    void testAddTask() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String doneTaskExample = "doneTaskExample";
        String toDoTaskExample = "toDoTaskExample";
        String inProgressTaskExample = "inProgressTaskExample";

        //when
        board.getDoneList().getTasks().add(doneTaskExample);
        board.getToDoList().getTasks().add(toDoTaskExample);
        board.getInProgressList().getTasks().add(inProgressTaskExample);

        //then
        assertEquals(doneTaskExample, board.getDoneList().getTasks().get(0));
        assertEquals(toDoTaskExample, board.getToDoList().getTasks().get(0));
        assertEquals(inProgressTaskExample, board.getInProgressList().getTasks().get(0));
    }
}
