package Snippets;
import java.util.Scanner;

public class HCF {
    private static int isHCF(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        int hcf=isHCF(a,b);
        int lcm=(a*b)/hcf;
        System.out.println("HCF: "+hcf +" and LCM: "+lcm);
    }
}
