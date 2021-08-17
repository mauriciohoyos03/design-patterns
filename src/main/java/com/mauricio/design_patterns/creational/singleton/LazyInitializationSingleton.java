package com.mauricio.design_patterns.creational.singleton;

/**
 * Lazy initialization method create the instance in the global access method.
 * It work fine in case the single-threaded environment but when it comes to multithreaded system
 * it can cause issues if multiples threads are inside the 'if' condition at the same time.
 */
public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){}

    public static LazyInitializationSingleton getInstance() {
        if (instance == null)
            instance = new LazyInitializationSingleton();
        return instance;
    }

    public void message() {
        System.out.println("Singleton class from Lazy initialization approach");
    }
}
