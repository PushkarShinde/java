package Collections.Lists;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        // str[30]="Shinde"; new element cannot be added in a normal array
        // Hence we use ArrayList
        ArrayList<String> al=new ArrayList<>();
        al.add("34");
        al.add("24");
        al.add("24");
        al.add("44");
        al.add(1,"34"); // at that index, rest will be right shifted
        al.remove(0);
        // whenever internally the set inside the arrayList get full,
        // it is copied in a new set with 1.5x capacity and the previous is deleted
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.contains("24")); // true

    }
}
