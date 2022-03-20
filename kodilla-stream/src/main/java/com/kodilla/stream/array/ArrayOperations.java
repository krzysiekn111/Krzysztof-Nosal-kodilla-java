package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static OptionalDouble getAverage(List<Integer> numbers) {
        OptionalDouble result = IntStream.range(0, numbers.size())
                .map(operand -> numbers.get(operand))
                .average();
        System.out.println(result);

        IntStream.range(0, numbers.size())
                .map(operand -> numbers.get(operand))
                .forEach(System.out::println);

        return result;
    }
}
