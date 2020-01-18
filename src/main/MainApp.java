package main;

import main.creational.singleton.*;

public class MainApp {
    public static void main(String... arg){

        singletonDemo();
    }

    private static void singletonDemo() {
        //Eager approach
        EagerInitializationSingleton eagerInitializationSingleton = EagerInitializationSingleton.getInstance();
        eagerInitializationSingleton.message();

        //Static block approach
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        staticBlockSingleton.message();

        //Lazy initialization approach
        LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
        lazyInitializationSingleton.message();

        //Thread safe approach
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstanceDoubleLocking();
        threadSafeSingleton.message();
        threadSafeSingleton1.message();

        //Bill pugh approach
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        billPughSingleton.message();
    }
}
