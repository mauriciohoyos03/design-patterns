package main.creational.singleton;

/**
 * Here, the instance of the class is created on the static block that provider option for
 * exception handling.
 * Both, eager initialization and static block initialization creates the instance even  before
 * it is being  used and that is not the best practice to use.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    //static block initialization for handling exceptions
    static {
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

    public void message() {
        System.out.println("Singleton class from static block approach");
    }
}
