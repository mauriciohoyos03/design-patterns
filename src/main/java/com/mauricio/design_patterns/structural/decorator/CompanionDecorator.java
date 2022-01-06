package com.mauricio.design_patterns.structural.decorator;

public class CompanionDecorator implements Companion{
    protected Companion companion;

    public void addCompanion(Companion c) {
        companion = c;
    }
    @Override
    public void doSomeThing() {
        companion.doSomeThing();
    }
}
