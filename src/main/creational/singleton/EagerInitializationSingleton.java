package main.creational.singleton;

/**
 * In Eager initialization, the instance of singleton class is create at the time of class
 * loading, this is the easiest method to create a singleton class but it has drawback that instance is
 * created even though client application might not be using it.
 *
 * If your singleton class is not using a lot of resources, this approach is right, but it is created for
 * resources such as File System, Database connections, etc. We should avoid the instantiation until client
 * call the getInstance method.
 */
public class EagerInitializationSingleton {
    private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

    //Private client to avoid client applications to use constructor.
    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance(){
        return instance;
    }

    public void message() {
        System.out.println("Singleton class from Eager approach");
    }
}
