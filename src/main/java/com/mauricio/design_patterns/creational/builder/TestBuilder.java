package com.mauricio.design_patterns.creational.builder;

public class TestBuilder {

    public static void main(String... arg) {
        Person person1 = new Person.PersonBuilder("Mauro", "Hoyos")
                .setAge(29)
                .setHeight(1.72)
                .setWeight(68)
                .setFathersName("Claudio").setMothersName("Ana Rosa")
                .build();
        System.out.println(person1.toString());
    }
}
