package com.mauricio.design_patterns.structural.facade;

public class KitchenSubSystem {

    public void prepareFood() {
        System.out.println("Cook food.");
    }

    public void callWaiter() {
        System.out.println("Call Waiter.");
    }

    public void washDishes() {
        System.out.println("Washing the dishes.");
    }
}
