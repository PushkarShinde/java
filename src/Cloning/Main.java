package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human pushkar=new Human(22,"Pushkar");
//        Human twin=new Human(pushkar); // created a copy of pushkar
        // this method required a lot of time and effort, so instead we can do something else, let's see

        Human twin= (Human)pushkar.clone(); // shallow copy
        System.out.println(twin.name +" "+ twin.age);
        System.out.println(Arrays.toString(twin.arr));

        // let's try to mute the array
        twin.arr[0]=100;
        System.out.println(Arrays.toString(pushkar.arr)); // modified....because we have created a shaloow copy not a deep one

        // Deep copy of DeepCopyHuman
        DeepCopyHuman anuj=new DeepCopyHuman(12, "Anuj");
        DeepCopyHuman twin2=(DeepCopyHuman)anuj.clone();
        System.out.println(Arrays.toString(twin2.arr));

        // now lets mute the twin2 arr
        twin2.arr[0]=100;
        System.out.println(Arrays.toString(anuj.arr));
    }
}
