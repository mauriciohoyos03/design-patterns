package com.mauricio.design_patterns.structural.decorator;

public class AffectiveCompanion extends CompanionDecorator {

    @Override
    public void doSomeThing() {
        super.doSomeThing();
        System.out.print("I am here to cheer you. ");
    }
}
