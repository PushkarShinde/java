package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array elements: \n");
        for(int i=0;i<a.length;i++){
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(a)); // printing the array
    }
}
