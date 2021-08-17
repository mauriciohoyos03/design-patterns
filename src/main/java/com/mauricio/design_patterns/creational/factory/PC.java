package com.mauricio.design_patterns.creational.factory;

public class PC extends Computer{

    private String ram;
    private String storage;
    private String cpu;

    public PC(String ram, String storage, String cpu) {
        this.ram = ram;
        this.storage = storage;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getStorage() {
        return this.storage;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
}
