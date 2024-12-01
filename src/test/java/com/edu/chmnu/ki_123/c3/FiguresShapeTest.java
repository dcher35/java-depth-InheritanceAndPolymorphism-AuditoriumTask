package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguresShapeTest {
    //Тест для перевірки коректності обчислення площі кола
    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        double expectedArea = Math.PI * 5 * 5;
        assertEquals(expectedArea, circle.getArea(), 0.001, "Circle area should be correct");
    }

    //Тест для перевірки коректності обчислення площі прямокутника
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 6);
        double expectedArea = 4 * 6;
        assertEquals(expectedArea, rectangle.getArea(), "Rectangle area should be correct");
    }

    //Тест для перевірки коректності обчислення площі трикутника
    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(3, 7);
        double expectedArea = 0.5 * 3 * 7;
        assertEquals(expectedArea, triangle.getArea(), "Triangle area should be correct");
    }

    //Тест для перевірки методу toString() базового класу
    @Test
    public void testToStringMethod() {
        Circle circle = new Circle(5);
        String expected = "Shape {name = Circle}";
        assertEquals(expected, circle.toString(), "toString method should return the correct string.");
    }
}