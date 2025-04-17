package Interfaces;

public class V10Engine implements Engine {
    private String cylinderCap = "6000cc";
    private String horsePower = "1000Hp";
    private String torque = "1000Nm";
    private String mileage = "10 km/h";

    @Override
    public void getCylinderCapacity() {
        System.out.println("The cylinder capacity of the V10 engine is: " + cylinderCap);
    }

    @Override
    public void getHorsePower() {
        System.out.println("The Horse Power of the V10 engine is: " + horsePower);
    }

    @Override
    public void getTorque() {
        System.out.println("The torque of the V10 engine is: " + torque);
    }

    @Override
    public void getMileage() {
        System.out.println("The mileage of the V10 engine is: " + mileage);
    }
}
