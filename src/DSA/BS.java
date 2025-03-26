package DSA;

public class BS {
    public static void main(String[] a){
        int[] ar={1,2,3,4,4,5,6,45,56,67,78,89,122,344,445};
        int target=67;
        System.out.println("The target lies at index: "+binarySearch(ar,target,0,ar.length-1));
    }

    public static int binarySearch(int[] ar, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m= s + (e-s)/2;
        if(ar[m]>target){
            return binarySearch(ar,target,s,m);
        }else if(ar[m]==target){
            return m;
        }
        return binarySearch(ar,target,m+1,e);
    }
}
