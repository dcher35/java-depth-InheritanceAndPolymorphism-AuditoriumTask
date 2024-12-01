package com.edu.chmnu.ki_123.c3;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public abstract double getArea();

    @Override
    public final String toString() {
        return "Shape {name = " + name + "}";
    }
}