package com.mauricio.design_patterns.structural.facade;

public class TestFacade {

    public static void main(String... arg) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.orderFood();
    }
}