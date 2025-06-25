package BinarySearch;
import java.util.Arrays;
public class Bound {
    public static void lowerBound(int[] num, int target){
        int[] arr=num;
        Arrays.sort(arr);
        int n=arr.length;
        int l=0,r=n;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Lower Bound: "+arr[l]);
    }public static void upperBound(int[] num, int target){
        int[] arr=num;
        Arrays.sort(arr);
        int n=arr.length;
        int l=0,r=n;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=target){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Upper Bound: "+arr[l]);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,34,5,6,3,52342344,23,234,45,23,432};
        int target=6;
        lowerBound(arr,target); //6
        upperBound(arr,target); //23
    }
}
