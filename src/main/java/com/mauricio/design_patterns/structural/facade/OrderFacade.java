package com.mauricio.design_patterns.structural.facade;

public class OrderFacade {
    private WaiterSubSystem waiter;
    private KitchenSubSystem kitchen;

    public OrderFacade() {
        waiter = new WaiterSubSystem();
        kitchen = new KitchenSubSystem();
    }

    public void orderFood(){
        System.out.println("A series of independent calls to various subsystems:");

        waiter.writeOrder();
        waiter.sendToKitchen();
        kitchen.prepareFood();
        kitchen.callWaiter();
        waiter.serveCustomer();
        kitchen.washDishes();
    }
}
