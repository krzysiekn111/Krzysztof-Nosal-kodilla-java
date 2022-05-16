package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When

        //Then
        assertEquals(2, calculator.add(1,1));
        assertEquals(0, calculator.subtract(1,1));
        assertEquals(25, calculator.multiple(5,5));
        assertEquals(5, calculator.divide(25,5));

    }
}
