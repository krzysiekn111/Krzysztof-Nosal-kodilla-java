package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public static List<Shape> shapes = new ArrayList<>();

    public static void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public static void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public static String getFigure(int n) {
        return shapes.get(n).getShapeName() + shapes.get(n).getField();
    }

    public static String showFigures() {
        String result = "";
        for (Shape item : shapes) {
            result += item.getShapeName() + item.getField();
        }
        return result;
    }
}
