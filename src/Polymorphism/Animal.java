package Polymorphism;

public class Animal {
    public String speak() {
        return "I make a sound";
    }
}

// Subclass
class Dog extends Animal {
    // Method Overriding: Same method name, same parameters, specific implementation
    @Override
    public String speak() {
        return "Woof!";
    }

    // Method Overloading: Same method name, different parameters
    public String speak(int times) {
        return "Woof! ".repeat(times);
    }
    public String speak(String prefix) {
        return prefix + " Woof!";
    }
}

