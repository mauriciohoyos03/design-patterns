package com.mauricio.design_patterns.structural.bridge;

public class Circle extends Shape{

    Circle(IShapeColor color) {
        super(color);
    }

    public void applyColor() {
        System.out.println("Rectangle filled with: ");
        this.color.fillColor();
    }
}
