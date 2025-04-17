package Interfaces.NestedInterfaces;

public class Main {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println("The number 45 is: "+(obj.isPrime(45)?"Prime.":"Composite."));
    }
}
