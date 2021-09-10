package com.mauricio.design_patterns.structural.composite;

public class Square implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Dibujando cuadro de color: " + fillColor);
    }
}
