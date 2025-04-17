package Abstraction;

public class Child extends AbstractParent {
    @Override
    void career(String job) {
        System.out.println(job);
    }
    @Override
    void partner(String spouse) {
        System.out.println(spouse);
    }
    static void myName(String name){
        System.out.println("My name is: "+name);
    }
    public static void main(String[] args) {
        Child ch=new Child();
        ch.career("Lieutenant");
        ch.partner("Wife");
        Child.myName("Pushkar"); // valid
        myName("Anuj"); // valid
    }
}
