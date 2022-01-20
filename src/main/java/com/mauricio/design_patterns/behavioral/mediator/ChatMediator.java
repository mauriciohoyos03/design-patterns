package com.mauricio.design_patterns.behavioral.mediator;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
