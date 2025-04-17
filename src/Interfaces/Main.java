package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.ABS();
        car.getMileage();
        car.breakPads();
        car.getCylinderCapacity();
        int gears = car.gears();
        car.getHorsePower();
        Engine v8=new V8Engine(); // upcasted
        v8.getHorsePower();
    }
}
