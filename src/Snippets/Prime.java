import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a Prime number.");
        }else{
            System.out.println(num+" is not a Prime number.");
        }
    }

    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%(i*i)==0){
                return false;
            }
        }
        return true;
    }
}
