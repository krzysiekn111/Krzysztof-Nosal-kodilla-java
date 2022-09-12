package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTestSuite {

    @Test
            public void testHomeworkQueue() {
        // Given
        StudentsTask springBootHomework = new SpringBootHomework();
        StudentsTask patternsHomework = new PatternsHomework();
        Mentor piotrKamiński = new Mentor("Piotr Kamiński");
        Mentor zbigniewBrzeziński = new Mentor("Zbigniew Brzeziński");
        springBootHomework.registerMentor(piotrKamiński);
        springBootHomework.registerMentor(zbigniewBrzeziński);
        patternsHomework.registerMentor(zbigniewBrzeziński);
        // When
        springBootHomework.addTask("exampleTask");
        springBootHomework.addTask("exampleTask");
        springBootHomework.addTask("exampleTask");
        patternsHomework.addTask("exampleTask");
        patternsHomework.addTask("exampleTask");
        // Then
        assertEquals(5, zbigniewBrzeziński.getUpdateCount());
        assertEquals(3, piotrKamiński.getUpdateCount());

    }


}
