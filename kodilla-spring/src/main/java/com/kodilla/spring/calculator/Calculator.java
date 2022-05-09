package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Calculator {

    @Autowired
    private Display display;

    public double multiple(double a, double b) {
        display.displayValue(a*b);
        return a*b;
    }
    public double divide(double a, double b) {
        display.displayValue(a/b);
        return a/b;
    }
    public double add(double a, double b) {
        display.displayValue(a+b);
        return a+b;
    }
    public double subtract(double a, double b) {
        display.displayValue(a-b);
        return a-b;
    }
}
