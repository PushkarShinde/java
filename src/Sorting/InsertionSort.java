package Sorting;

import java.util.Arrays;

public class InsertionSort {
    /**
     * 🍵 Real-Life Analogy
     * Imagine you're sorting playing cards in your hand:
     * You pick cards one by one from the deck.
     * For each card, you insert it into the correct position in your hand (which is already sorted).
     * You shift the larger cards to the right to make space.
     * That’s insertion sort!
     * */
    private static void insertionSort(int[] arr, int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){ // changing it to arr[j]<=key will sort in descending, coool init!!
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    private static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={45,32,4234,1,6,8,34,9,5,55};
        int n=arr.length;
        System.out.println("The array before sorting: ");
        printArray(arr);
        insertionSort(arr,n);
        System.out.println("The array after sorting: ");
        printArray(arr);
    }
}
