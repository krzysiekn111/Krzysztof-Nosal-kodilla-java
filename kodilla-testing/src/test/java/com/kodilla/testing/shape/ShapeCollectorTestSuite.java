package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@DisplayName("Shape collector test suite")
public class ShapeCollectorTestSuite {
    @Nested
    @DisplayName("Adding and removing")
    public class AddingAndRemoving {
        @Test
        @DisplayName("Testing adding figures")
        void testAddFigure() {
            //given
            Shape circle = new Circle("circle", "2 square meters");
            ShapeCollector.addFigure(circle);
            //when
            int actualSize = ShapeCollector.shapes.size();
            //then
            Assertions.assertEquals(1, actualSize);
            ShapeCollector.shapes.clear();
        }
        @Test
        @DisplayName("Testing removing figures")
        void testRemoveFigure() {
            //given
            Shape circle = new Circle("circle", "2 square meters");
            Shape circle2 = new Circle("circle2", "1 square meters");
            ShapeCollector.addFigure(circle);
            ShapeCollector.addFigure(circle2);
            //when
            int expectedSize = 1;
            ShapeCollector.removeFigure(circle2);
            //then
            Assertions.assertEquals(expectedSize, ShapeCollector.shapes.size());
            ShapeCollector.shapes.clear();
        }
    }
    @Nested
    @DisplayName("Getting and Showing")
    public class gettingAndShowing {
        @DisplayName("Testing getting figures")
        @Test
        void testGetFigure() {
            //given
            Shape circle = new Circle("circle", "2 square meters");
            ShapeCollector.addFigure(circle);
            //when
            String cricleProperties = "circle" + "2 square meters";
            //then
            Assertions.assertEquals(cricleProperties, ShapeCollector.getFigure(0));
        }
        @Test
        @DisplayName("Testing showing figures")
        void testShowFigures() {
            //given
            Shape circle = new Circle("circle", "2 square meters");
            Shape circle2 = new Circle("circle2", "1 square meters");
            ShapeCollector.addFigure(circle);
            ShapeCollector.addFigure(circle2);
            //when
            String expectedValue = "circle" + "2 square meters" + "circle2" + "1 square meters";
            //then
            Assertions.assertEquals(expectedValue, ShapeCollector.showFigures());
        }
    }
}
