package Interfaces.ExtendsInterface;

public class Main implements B{
    // Now main has to implement all the methods of child interface B as well as the parent interface A.
    @Override
    public void name() {
        System.out.print("Pushkar");
    }

    @Override
    public void surname() {
        System.out.print(" Shinde");
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.name();
        m.surname();
    }
}
