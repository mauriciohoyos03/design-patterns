package com.mauricio.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
Composite Pattern consists of following objects.

    1. Base Component – Base component is the interface for all objects in the composition,
         client program uses base component to work with the objects in the composition.
         It can be an interface or an abstract class with some methods common to all the objects.
    2. Leaf – Defines the behaviour for the elements in the composition.
         It is the building block for the composition and implements base component.
         It doesn’t have references to other Components.
    3. Composite – It consists of leaf elements and implements the operations in base component.
*/

public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape: shapes) {
            shape.draw(fillColor);
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    public void clear() {
        System.out.println("Limpiando lista de figuras...");
        this.shapes.clear();
    }
}
