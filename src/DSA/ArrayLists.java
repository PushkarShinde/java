package DSA;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(20); // added 20 as the first element to it
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(30);
        System.out.println(list);
        list.add(1,70); // adds at that index
        System.out.println(list);
        System.out.println(list.contains(50)); // return a boolean if the element is present
        System.out.println(list.get(4)); // get the element
        list.set(0,90); // updates elements
        System.out.println(list);
//        list.clear(); // will empty the ArrayList
        list.remove(5); // removes from that index
        System.out.println(list);

        for(int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
