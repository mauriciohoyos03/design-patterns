package com.mauricio.design_patterns.structural.composite;

public class Triangle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Dibujando triangulo de color " + fillColor);
    }
}
