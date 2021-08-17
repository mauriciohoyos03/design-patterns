package com.mauricio.design_patterns.creational.singleton;

/**
 * The easier way to create the thread-safe singleton class is to make the global access method
 * synchronized, so that only one thread can execute this method at a time. This approach works
 * fine and provide thread-safety but it reduce the performance because of the cost associated
 * with the synchronized method. Although we need it only for the first few threads who might
 * create the separate instances.
 *
 * To avoid this extra overhead every time, double checked locking principle is used. In this approach
 * the synchronize block is used inside the 'if' condition whith additional checked to ensure
 * only one instance of a singleton class is created.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null)
            instance = new ThreadSafeSingleton();

        return instance;
    }

    public static ThreadSafeSingleton getInstanceDoubleLocking(){
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class){
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
         return instance;
    }

    public void message() {
        System.out.println("Singleton class from ThreadSafe approach");
    }
}
