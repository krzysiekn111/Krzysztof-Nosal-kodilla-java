package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;

    private String field;

    public Circle(String name, String field) {
        this.name = name;
        this.field = field;
    }


    public String getShapeName() {
        return name;
    }
    public String getField() {
        return field;
    }
}