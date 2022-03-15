package com.kodilla.testing.shape;

public class Square implements Shape {
    public Square(String name, String field) {
        this.name = name;
        this.field = field;
    }

    private String name;
    private String field;
    public String getShapeName() {
        return name;
    }
    public String getField() {
        return field;
    }
}
