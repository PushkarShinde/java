package Inheritance;

//public final class Box { // early binding to prevent Inheritance
public class Box{
    double l;
    double h;
    double w;

    Box(){
        super(); // this is referring to the 'Object class'
        // Class 'Object' is the root of the class hierarchy.
        // Every class has 'Object' as a superclass.
        // All objects, including arrays, implement the methods of this class.
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    static void greetings(){
        System.out.println("Hey, I am in the box class, Greetings!");
    }

    Box(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    // Cube
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }

    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    public static void main(String[] args) {
        System.out.println("Running the box");
    }

}

