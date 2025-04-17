package DSA;

public class BS {
    public static void main(String[] a){
        int[] ar={1,2,3,4,4,5,6,45,56,67,78,89,122,344,445};
        int target=67;
        System.out.println("The target lies at index: "+binarySearch(ar,target));
    }
    
    public static int binarySearch(int[] nums, int target) {
        int n = nums.length; //size of the array.
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
