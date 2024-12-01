package com.edu.chmnu.ki_123.c3;

public class FiguresShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        System.out.printf("%s area: %.3f%n", circle.getName(), circle.getArea());
        System.out.printf("%s area: %.3f%n", rectangle.getName(), rectangle.getArea());
        System.out.printf("%s area: %.3f%n", triangle.getName(), triangle.getArea());
    }
}