import java.sql.SQLOutput;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Namaste Duniya!");
        System.out.println("Now I'll be taking input from you, the user!");
        Scanner sc = new Scanner(System.in); // sc is just a variable name
        System.out.println("Enter your name: ");
        String name=sc.nextLine(); // read a String sentence
        System.out.println("Enter your age: ");
        int age1=sc.nextInt(); // read an int
        System.out.println("Enter your brother's age: ");
        double age2=sc.nextDouble();
        System.out.println("The sum of your ages is: "+(age1+age2));
    }
}
