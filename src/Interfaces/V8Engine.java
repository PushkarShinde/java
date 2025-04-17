package Interfaces;

public class V8Engine implements Engine {
    private String cylinderCap = "4000cc";
    private String horsePower = "500Hp";
    private String torque = "500Nm";
    private String mileage = "15 km/h";

    @Override
    public void getCylinderCapacity() {
        System.out.println("The cylinder capacity of the V8 engine is: " + cylinderCap);
    }

    @Override
    public void getHorsePower() {
        System.out.println("The Horse Power of the V8 engine is: " + horsePower);
    }

    @Override
    public void getTorque() {
        System.out.println("The torque of the V8 engine is: " + torque);
    }

    @Override
    public void getMileage() {
        System.out.println("The mileage of the V8 engine is: " + mileage);
    }
}