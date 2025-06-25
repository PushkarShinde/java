package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box(5.5, 4.6, 6.8);
        Box box2=new Box(box1);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        // output: 5.5 6.8 4.6
        // wow!!

        BoxWeight box3=new BoxWeight();
        System.out.println(box3.l+" "+box3.w+" "+box3.h+" "+box3.weight);
        // output: -1.0 -1.0 -1.0 -1.0, because 'l,h,w' are not initialised in the child class

        BoxWeight box4=new BoxWeight(1,2,3,4);
        System.out.println(box4.l+" "+box4.w+" "+box4.h+" "+box4.weight);
        //  output: 1.0 3.0 2.0 4.0, hehe! cool init!!

        BoxPrice box5=new BoxPrice();
        System.out.println(box5.l+" "+box5.w+" "+box5.h+" "+box5.weight+" "+box5.cost);

        Box.greetings();
    }
}
