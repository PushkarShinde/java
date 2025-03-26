package singleton;

public class Singleton {
    // Static instance created at class loading time
    private static final Singleton instance = new Singleton();

    // Private constructor to prevent instantiation
    private Singleton() {

    }

    // Public method to access the instance
    public static Singleton getInstance() {
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

class SingletonDemo {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        obj1.showMessage();
        System.out.println(obj1 == obj2); // true (same instance)
    }
}
