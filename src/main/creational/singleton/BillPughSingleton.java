package main.creational.singleton;

/**
 * Bill pugh came up a different approach to created a singleton class using
 * an 'inner static helper class'.
 * The private static inner class contains the instance of the singleton class, when the singleton class
 * is loaded, 'SingletonHelper' class is not loaded into memory and only when someone call the getInstance
 * method, this class gets loaded and created the singleton class instance.
 */
public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void message() {
        System.out.println("Singleton class from Bill pugh approach");
    }
}
