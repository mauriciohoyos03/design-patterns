package com.mauricio.design_patterns.behavioral.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImp();
        User user1 = new UserImpl(chatMediator, "Mauricio");
        User user2 = new UserImpl(chatMediator, "Gabriela");
        User user3 = new UserImpl(chatMediator, "Dante");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.send("Hello every one");
    }
}
