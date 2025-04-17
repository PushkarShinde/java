package singleton;

import AccessControl.A;

public class Main {
    public static void main(String[] args) {

        Singleton obj=Singleton.getInstance();

        A a=new A();
        System.out.println("My Birthday is on: "+a.getNum());
        // kyuki getNum ek public method hai
    }
}
