package com.mauricio.design_patterns.structural.bridge;

public class Rectangle extends Shape{

    Rectangle(IShapeColor color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Rectangle filled with: ");
        this.color.fillColor();
    }
}
