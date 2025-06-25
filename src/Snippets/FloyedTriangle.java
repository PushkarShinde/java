package Snippets;
import java.util.Scanner;

public class FloyedTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int n=1;
        for(int i=0;i<num;i++){
            int j=i+1;
            while(j!=0){
                System.out.print(n +" ");
                n++;
                j--;
            }
            System.out.println();
        }
    }
}
