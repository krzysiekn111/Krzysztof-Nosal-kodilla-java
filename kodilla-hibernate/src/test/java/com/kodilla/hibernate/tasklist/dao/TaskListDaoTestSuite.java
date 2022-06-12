package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        String listName = "list";
        TaskList taskList = new TaskList(listName, "");
        //When
        taskListDao.save(taskList);
        //Then
        List<TaskList> listExample = taskListDao.findByListName(listName);
        assertEquals(1, listExample.size());

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }
}
