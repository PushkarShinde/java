package Sorting;

import java.util.Arrays;

public class BubbleSort {
    /**
     * 🫧 What is Bubble Sort?
     * Bubble Sort is a simple comparison-based sorting algorithm.
     * It works by repeatedly swapping adjacent elements if they are in the wrong order —
     * like bubbles rising to the surface, the largest numbers "bubble up" to the end in each pass.
     *
     * 🍵 Real-Life Analogy
     * Imagine you're sorting students in a line from shortest to tallest.
     * You go from left to right and compare each pair:
     * If the one on the left is taller, you swap them.
     * You keep doing this until no more swaps are needed.
     *
     * 🔁 Step-by-Step Algorithm
     * For an array of size n:
     * Repeat n-1 times:
     * For each pair of adjacent elements:
     * If the left one is greater, swap them.
     * If no swaps are made in a pass → array is sorted!
     * */
    private static void bubbleSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
        bubbleSort(arr,n);
        System.out.println("The array after sorting: ");
        printArray(arr);
    }
}
