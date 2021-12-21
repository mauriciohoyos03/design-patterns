package com.mauricio.design_patterns.structural.bridge;

public class BlueColorImp implements IShapeColor{

    @Override
    public void fillColor() {
        System.out.println("Blue color.");
    }
}
