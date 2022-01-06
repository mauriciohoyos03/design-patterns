package com.mauricio.design_patterns.structural.decorator;

public class HelperCompanion extends CompanionDecorator{

    @Override
    public void doSomeThing() {
        super.doSomeThing();
        System.out.print("I am here for help you. ");
    }
}
