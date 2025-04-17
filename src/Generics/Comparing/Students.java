package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Students implements Comparable<Students>{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name=name;
    }

    @Override
    public int compareTo(Students o) {
        return this.age-o.age; // sorting by age
//        if diff ==0 then the objects are equal
//        if diff >0 then the objects is greater than the other object
//        if diff <0 then the objects is smaller than the other object
    }

    @Override
    public String toString() {
        return "Students{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Students pushkar=new Students(22,"Pushkar");
        Students anuj=new Students(18,"Anuj");
        Students alka=new Students(51,"Anuj");
        Students kanchan=new Students(58,"Anuj");

        // We cannot compare objects directly like it's some primitive, kuch izzat karo bhai
//        if(pushkar<anuj){
//            System.out.println("Pushkar is greater than Anuj");
//        }

        Students[] list={pushkar, anuj, alka, kanchan};
        System.out.println("Before Sorting: "+Arrays.toString(list));
        Arrays.sort(list, new Comparator<Students>() { // this can also be represented as a lambda function
            @Override
            public int compare(Students o1, Students o2) {
                return (int)(o1.age- o2.age);
            }
        });
        System.out.println("After sorting by age: " + Arrays.toString(list));
        if(pushkar.compareTo(anuj)>0){
            System.out.println("Pushkar is elder than Anuj.");
        }else{
            System.out.println("Anuj is elder than Pushkar.");
        }
        if(kanchan.compareTo(alka)>0){
            System.out.println("Kanchan is elder than Alka.");
        }else{
            System.out.println("Alka is elder than Kanchan.");
        }
    }
}
