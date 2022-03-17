package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import com.kodilla.testing.shape.ShapeCollector;
@DisplayName("Shape collector test suite")
public class ShapeCollectorTestSuite {
    @Nested
    @DisplayName("Adding and removing")
    public class AddingAndRemoving {
        @Test
        @DisplayName("Testing adding figures")
        void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", "2 square meters");
            shapeCollector.addFigure(circle);
            //when
            int actualSize = shapeCollector.shapes.size();
            //then
            Assertions.assertEquals(1, actualSize);
        }
        @Test
        @DisplayName("Testing removing figures")
        void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", "2 square meters");
            Shape circle2 = new Circle("circle2", "1 square meters");
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle2);
            //when
            int expectedSize = 1;
            shapeCollector.removeFigure(circle2);
            //then
            Assertions.assertEquals(expectedSize, shapeCollector.shapes.size());
        }
    }
    @Nested
    @DisplayName("Getting and Showing")
    public class gettingAndShowing {
        @DisplayName("Testing getting figures")
        @Test
        void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", "2 square meters");
            shapeCollector.addFigure(circle);
            //when
            String cricleProperties = "circle" + "2 square meters";
            //then
            Assertions.assertEquals(cricleProperties, shapeCollector.getFigure(0));
        }
        @Test
        @DisplayName("Testing showing figures")
        void testShowFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", "2 square meters");
            Shape circle2 = new Circle("circle2", "1 square meters");
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle2);
            //when
            String expectedValue = "circle" + "2 square meters" + "circle2" + "1 square meters";
            //then
            Assertions.assertEquals(expectedValue, shapeCollector.showFigures());
        }
    }
}
