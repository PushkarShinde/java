import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println(num+" is an Armstrong number.");
        }else{
            System.out.println(num+" is not an Armstrong number.");
        }
    }

    static boolean isArmstrong(int n){
        int num=n;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit*digit*digit;
            num/=10;
        }
        return sum==n;
    }
}
