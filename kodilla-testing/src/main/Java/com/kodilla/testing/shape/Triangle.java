package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private String field;

    public Triangle(String name, String field) {
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
