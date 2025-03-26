package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Square square=new Square();
        shape.area();//I am a Shape, Cool..init!
        circle.area();//I am a circle!
        triangle.area();//I am a Triangle!
        square.area();//I am a Square!

//      Runtime Polymorphism, a.k.a. Dynamic Method Dispatch
        Shapes circle1=new Circle();
        Shapes triangle1=new Triangle();
        Shapes square1=new Square();
        circle1.area(); //I am a circle!
        triangle1.area(); //I am a Triangle!
        square1.area(); //I am a Square!

//      Compile time Polymorphism, a.k.a. Static Polymorphism
        Numbers num=new Numbers();
        System.out.println(num.sum(3,6));
        System.out.println(num.sum(2,34,35,2));
    }
}

/*
A person can have different characteristics at the same time.
Like a man at the same time is a father, a husband, and an employee.
So the same person possesses different behaviors in different situations.
This is called polymorphism.
 */