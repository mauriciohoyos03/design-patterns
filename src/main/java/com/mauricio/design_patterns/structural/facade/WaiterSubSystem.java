package com.mauricio.design_patterns.structural.facade;

public class WaiterSubSystem {
    public void writeOrder() {
        System.out.println("Waiter writes client's order.");
    }

    public void sendToKitchen() {
        System.out.println("Send order to kitchen.");
    }

    public void serveCustomer() {
        System.out.println("Yeah! customer is served.");
    }
}
