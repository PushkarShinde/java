package Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{12,24,26,31};
    }

//    public Human(Human o){
//        this.age=o.age;
//        this.name=o.name;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

}
