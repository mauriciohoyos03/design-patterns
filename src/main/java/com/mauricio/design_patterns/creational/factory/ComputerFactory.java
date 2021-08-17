package com.mauricio.design_patterns.creational.factory;

public class ComputerFactory {
    private static final String PC_TYPE = "PC";
    private static final String SERVER_TYPE = "SERVER";

    /**
     * We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
     */
    public static Computer getComputer(String typeComputer, String ram, String storage, String cpu) {
        if (typeComputer.equals(PC_TYPE)) {
            return new PC(ram, storage, cpu);
        } else if (typeComputer.equals(SERVER_TYPE)) {
            return new Server(ram, storage, cpu);
        }
        return null;
    }
}
