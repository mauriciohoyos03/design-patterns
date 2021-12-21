package com.mauricio.design_patterns.structural.bridge;

public class BridgeTest {

    public static void main(String... args) {
        Shape rectangle1 = new Rectangle(new BlueColorImp());
        Shape rectangle2 = new Rectangle(new RedColorImp());

        rectangle1.applyColor();
        rectangle2.applyColor();

        Shape circle1 = new Circle(new BlueColorImp());
        Shape circle2 = new Circle(new RedColorImp());

        circle1.applyColor();
        circle2.applyColor();
    }
}
