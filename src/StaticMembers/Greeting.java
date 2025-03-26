package StaticMembers;
import DSA.BS;

public class Greeting {
    public void greet(String s){
        System.out.println("Hello "+s+"!");
    }

    public static void index(int[] arr, int t){
        BS in=new BS();
        int ind=BS.binarySearch(arr,t,0,arr.length-1);
        System.out.println("a["+ind+"]");
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,543,4,2,342,2312};
        Greeting.index(arr,55);
    }
}
