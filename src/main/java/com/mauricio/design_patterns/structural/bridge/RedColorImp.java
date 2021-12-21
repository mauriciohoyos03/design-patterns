package com.mauricio.design_patterns.structural.bridge;

public class RedColorImp implements IShapeColor{

    @Override
    public void fillColor() {
        System.out.println("Red color");
    }
}
