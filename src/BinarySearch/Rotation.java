package BinarySearch;

public class Rotation {
    public static void rightRotate(int[] arr, int k){
        int n=arr.length;
        reverse(arr,0,n-1); // reverse all items
        reverse(arr,0,k-1); // reverse first k items
        reverse(arr,k,n-1);// reverse remaining items
    }

    public static void reverse(int[] arr, int l, int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++; r--;
        }
    }

    public static void leftRotate(int[] arr, int k){
        int n=arr.length;
        reverse(arr,0,k-1); // reverse first k items
        reverse(arr,k,n-1);// reverse remaining items
        reverse(arr,0,n-1); // reverse all items
    }
    public static void main(String[] args) {

    }
}
