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


        // Create objects
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Animal dogAsAnimal = new Dog(); // Polymorphic reference

        // Method Overriding (Run-time Polymorphism)
        System.out.println("Overriding Examples:");
        System.out.println(genericAnimal.speak()); // Output: I make a sound
        System.out.println(dog.speak());           // Output: Woof!
        System.out.println(dogAsAnimal.speak());   // Output: Woof! (Run-time polymorphism)

        // Method Overloading (Compile-time Polymorphism)
        System.out.println("\nOverloading Examples:");
        System.out.println(dog.speak());           // Output: Woof!
        System.out.println(dog.speak(3));          // Output: Woof! Woof! Woof!
        System.out.println(dog.speak("Hello"));    // Output: Hello Woof!
    }
}

/*
A person can have different characteristics at the same time.
Like a man at the same time is a father, a husband, and an employee.
So the same person possesses different behaviors in different situations.
This is called polymorphism.
 */