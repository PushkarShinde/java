package Sorting;
import java.util.*;
public class SelectionSort {
    /**
     * 🧠 What is Selection Sort?
     * Selection Sort is one of the simplest sorting algorithms.
     * It sorts an array by repeatedly finding the minimum (or maximum) element and putting it in its correct position.
     *
     * 🧮 Real-Life Analogy
     * Imagine you're picking a team from a group of players.
     * You want the shortest person first in the lineup.
     * So you:
     * Look through everyone and find the shortest.
     * Put that person in the first position.
     * Then find the next shortest from the rest.
     * And so on...
     *
     * 🔁 Algorithm (Step-by-Step)
     * For an array of size n:
     * Start from index i = 0.
     * Find the smallest element from index i to n-1.
     * Swap it with the element at index i.
     * Repeat for i = 1 to n-2.
     * */
    private static void selectionSort(int[] arr, int n){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=arr[i];
            int index=i;
            for(int j=i;j<n;j++){
                if(min>arr[j]) {
                    min = arr[j];
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
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
        selectionSort(arr,n);
        System.out.println("The array after sorting: ");
        printArray(arr);
    }
}
