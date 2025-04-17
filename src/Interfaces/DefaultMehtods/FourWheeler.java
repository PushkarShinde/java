package Interfaces.DefaultMehtods;

interface FourWheeler {
    default void print() {
        System.out.println("I am a four wheeler");
    }
    String carName="Audi R8 V10";
    static void carName(){
        System.out.println("My car name is: "+carName);
    }
}
