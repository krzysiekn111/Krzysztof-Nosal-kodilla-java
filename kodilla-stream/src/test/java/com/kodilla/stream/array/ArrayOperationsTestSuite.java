package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        List numbers = Arrays.asList(7, 3, 2, 6, 7, 4, 5, 8, 3, 2, 11, 4, 7, 8, 0, 13, 6, 8, 10);

        OptionalDouble expectedValue = ArrayOperations.getAverage(numbers);
        assertEquals(OptionalDouble.of(6.0), expectedValue);
    }
}
