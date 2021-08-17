package com.mauricio.design_patterns.creational.factory;
 /** The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to
    return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the
    client program to the factory class.
    Super class in factory design pattern can be an interface, abstract class or a normal java class.
 **/
public abstract class Computer {
    public abstract String getRam();
    public abstract String getStorage();
    public abstract String getCpu();

    @Override
    public String toString() {
        return "Ram: " + this.getRam() + ", " +
                "Storage: " + this.getStorage() + ", " +
                "Cpu: " + this.getCpu();
    }
}