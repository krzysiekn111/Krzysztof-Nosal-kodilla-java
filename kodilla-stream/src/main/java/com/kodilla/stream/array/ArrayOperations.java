package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(Integer[] numbers) {
        IntStream.range(0, numbers.length)
                .map(operand -> numbers[operand])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .map(operand -> numbers[operand])
                .average()
                .orElse(0);
    }
}
