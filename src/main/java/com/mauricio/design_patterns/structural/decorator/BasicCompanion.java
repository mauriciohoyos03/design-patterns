package com.mauricio.design_patterns.structural.decorator;

public class BasicCompanion implements Companion{

    @Override
    public void doSomeThing() {
        System.out.print("Hello! ");
    }
}
