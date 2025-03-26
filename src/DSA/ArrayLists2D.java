package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>(); // 2d AL
        Scanner in=new Scanner(System.in);
        // initialising the 2D AL with 3 ALs
        for(int i=0;i<3;i++){
            list.add(new ArrayList<Integer>());
        }

        // Adding elements to the 2D AL
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
// wow!!
