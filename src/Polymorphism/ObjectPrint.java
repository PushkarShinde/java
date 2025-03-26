package Polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){
        this.num=num;
    }

    @Override
    public String toString() { // kuch nahi bhai, maine bas alt+insert dabaya and enter, then ye aa gaya....Ayla Jadu, init!!
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }// btw override isiliye aya kyuki toString() is already a method of the object class (a.k.a. Bhagwaan class)

    public static void main(String[] args) {
        ObjectPrint op=new ObjectPrint(50);
        System.out.println(op); //this println() here is calling the valueOf() function, which is in turn calling the toString() function
    }
}
