package Interfaces.DefaultMehtods;

class Car implements Vehicle, FourWheeler {
    /*If a class implements multiple interfaces with the same default method,
    it must override that method to resolve the conflict.
    * */
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        System.out.println("I am a car");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.print();
        FourWheeler.carName();

    }
}

