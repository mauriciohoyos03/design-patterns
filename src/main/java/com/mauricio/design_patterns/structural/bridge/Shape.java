package com.mauricio.design_patterns.structural.bridge;

public abstract class Shape {
    protected IShapeColor color;

    Shape(IShapeColor color) {
        this.color = color;
    }

    abstract public void applyColor();
}
