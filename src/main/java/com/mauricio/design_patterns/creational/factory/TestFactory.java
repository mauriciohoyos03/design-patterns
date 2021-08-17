package com.mauricio.design_patterns.creational.factory;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "8Gb", "1 TB", "3.5 GHz");
        Computer server = ComputerFactory.getComputer("SERVER", "32 GB", "10 TB", "8 GHz");

        System.out.println("Factory PC Config: " + pc.toString());
        System.out.println("Factory Server Config:" + server.toString());
    }
}
