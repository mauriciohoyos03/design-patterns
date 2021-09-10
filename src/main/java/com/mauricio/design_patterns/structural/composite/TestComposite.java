package com.mauricio.design_patterns.structural.composite;

public class TestComposite {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape square = new Square();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(square);

        drawing.draw("rojo");
    }
}
