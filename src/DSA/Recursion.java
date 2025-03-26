package DSA;

public class Recursion {
    public static void main(String[] args){
        message(10);
        int x=1233456;
        System.out.println(sum(x));
        reverse(x);
    }

    static void message(int n){
        if(n==0) {
            System.out.println("Namaste World: " + n);
        }else{
//            System.out.println("Namaste World: " + n); // this will output in reverse order!
            message(n-1);
            System.out.println("Namaste World: " + n); // straight order!
        }
    }
    static int sum(int x){
    //        if(n%10==n){
    //            return n;
    //        } base case for product
        if(x==0) {
            return 0;
        }else{
            return x%10 + sum(x/10);
            // return x%10 * sum(x/10) // product
        }
    }
    static int sum=0;
    static void reverse(int x){
        if(x==0){
            System.out.println(sum);
            return;
        }else{
            int rem=x%10;
            sum=sum*10+rem;
            reverse(x/10);
        }
    }
} 