import java.util.*;

public class Function {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            sumInt();
            System.out.println();
        }
    }
    static void sumInt(){ // A function used to carry out the sum
        Scanner sc= new Scanner(System.in); // creating scanner object
        System.out.println("Enter the first number: ");
        int a=sc.nextInt(); // taking an integer input
        System.out.println("Enter the second number: ");
        int b= sc.nextInt();
        System.out.println("The sum of the two number is: "+(a+b));
    }
}