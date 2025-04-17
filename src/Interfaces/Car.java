package Interfaces;

/**
 * Interfaces in Java: A Complete Guide
 * An interface in Java is a blueprint for a class, defining a set of methods that implementing classes must provide. It is a key feature for achieving abstraction and multiple inheritance in Java. Below, you'll find everything you need to know about interfaces, explained concisely.
 * What is an Interface?
 * An interface is a reference type in Java, similar to a class, but it can only contain:
 * Abstract methods (methods without bodies).
 * Constants (implicitly public, static, and final).
 * Default methods (introduced in Java 8, with method bodies).
 * Static methods (introduced in Java 8, with method bodies).
 * Private methods (introduced in Java 9, for internal use within the interface).
 * Interfaces define a contract that implementing classes must adhere to. They are declared using the interface keyword.
 * Key Features of Interfaces
 * Methods and Fields:
 * Methods in interfaces are implicitly public and abstract unless they are default or static.
 * Fields are implicitly public, static, and final.
 * No Constructors:
 * Interfaces cannot have constructors because they cannot be instantiated directly.
 * Multiple Inheritance:
 * A class can implement multiple interfaces, overcoming the single inheritance limitation of classes.
 * Achieving Abstraction:
 * Interfaces allow you to define behaviors without specifying how they are implemented.
 * */
public class Car implements BreakingSystem, Engine, Transmission{
    String horsePower="900Hp";
    String mileage="20kmph";
    String torque="400Nm";
    String cylinderCap ="2000cc";

    @Override
    public void ABS() {

    }

    @Override
    public void breakPads() {

    }

    @Override
    public void getCylinderCapacity() {
        System.out.println("The Cylinder Capacity of the Car is: "+cylinderCap);
    }

    @Override
    public void getHorsePower() {
        System.out.println("The horse power of the Car is: "+horsePower);
    }

    @Override
    public void getTorque() {
        System.out.println("The torque of the Car is: "+torque);
    }

    @Override
    public void getMileage() {
        System.out.println("The mileage of the Car is: "+mileage);
    }

    @Override
    public void gearBox() {

    }

    @Override
    public int gears() {
        return 0;
    }
}
