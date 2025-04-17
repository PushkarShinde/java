public class SumofDigits {
    public static void main(String[] a){
        int x=1233456;
        System.out.println(sum(x));
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


}
