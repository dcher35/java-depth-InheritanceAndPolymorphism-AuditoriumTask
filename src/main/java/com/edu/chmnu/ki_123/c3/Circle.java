package com.edu.chmnu.ki_123.c3;

import lombok.Getter;

@Getter
public final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}