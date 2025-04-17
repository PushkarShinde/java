package Interfaces;

public class NiceCar {
    private Engine engine; // declaring an object of type Engine

    public NiceCar() {
        this.engine = new V10Engine(); // assigning memory in the heap for the object, but we must use the constructor of the implementing class.
        // We can never instantiate an Interface. But we can refer to an Object (that implements that interface) by the type of that Interface.
    }

    public NiceCar(Engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }
        this.engine = engine;
    }

    public void displayHorsePower() {
        engine.getHorsePower();
    }

    public Engine getEngine() {
        return engine;
    }

    public static void main(String[] args) {
        NiceCar car1 = new NiceCar();
        car1.displayHorsePower(); //The Horse Power of the V10 engine is: 1000Hp

        // create a miceCar with a v8 engine
        Engine v8Engine= new V8Engine(); // Cast to V8Engine if needed
        NiceCar car2 = new NiceCar(v8Engine);
        car2.displayHorsePower(); // The Horse Power of the V8 engine is: 500Hp
    }
}