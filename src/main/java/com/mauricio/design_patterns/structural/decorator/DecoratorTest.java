package com.mauricio.design_patterns.structural.decorator;

public class DecoratorTest {
    public static void main(String... arg) {

        //Basic
        BasicCompanion basic1 = new BasicCompanion();
        basic1.doSomeThing();
        System.out.println("");
        //Basic + Helper
        BasicCompanion basic2 = new BasicCompanion();
        HelperCompanion helper = new HelperCompanion();
        helper.addCompanion(basic2);
        helper.doSomeThing();
        System.out.println("");
        //Basic + Helper + Affective
        BasicCompanion basic3 = new BasicCompanion();
        HelperCompanion helper2 = new HelperCompanion();
        AffectiveCompanion affective = new AffectiveCompanion();
        affective.addCompanion(basic3);
        helper2.addCompanion(affective);
        helper2.doSomeThing();
        System.out.println("");

    }
}
