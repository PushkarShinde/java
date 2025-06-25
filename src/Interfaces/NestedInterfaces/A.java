package Interfaces.NestedInterfaces;

public class A {
    public interface NestedInterface{
        // all variables shall be implicitly public static and final
        boolean isPrime(int num);
        // all methods will be implicitly public and abstract, unless explicitly declared default or static
    }
}
