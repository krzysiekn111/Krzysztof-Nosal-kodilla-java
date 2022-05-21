package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testLoopAndConditionalBreakpoints {
    @Test
    void testLoop() {
        long sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.println("[" + i + "] Sum equals: " + sum);
        }
        assertEquals(499500, sum);
    }
}
