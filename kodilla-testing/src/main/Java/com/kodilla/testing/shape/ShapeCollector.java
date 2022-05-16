package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public String getFigure(int n) {
        return shapes.get(n).getShapeName() + shapes.get(n).getField();
    }
//    public static Shape getFigure(int n) {
//        Shape Shape = null;
//        return Shape;
//    }

    public String showFigures() {
        String result = "";
        for (Shape item : shapes) {
            result += item.getShapeName() + item.getField();
        }
        return result;
    }
}
