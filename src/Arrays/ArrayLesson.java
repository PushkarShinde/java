package Arrays;

import org.w3c.dom.ls.LSOutput;
import java.util.Arrays;

public class ArrayLesson {
    // 1. Declaration (All valid ways)
    int[] x; // best practice, because the name is clearly separated from the type
    int []y;
    int z[];

    // 2. 2D Array decalaration
    static int[][] a=new int[2][4]; // initialised and declared as static to this one because I am using it in the main fn.
    int [][]b;
    int []c[];
    int[] []d;
    int e[][];

    // 3. mixed declaration
    int[] f,g; // dimention of f=1, g=1
    int[] h[], i; // dimention of h=2, i=1
    int[] j[], k[]; // dimention of j=2, k=1
    int[] []l, m[]; // if we are specifying the dimention of the variable,
    // we can do so as prifix, only for the first variable, for other variables we have to do so as a suffix only.
    int[] []n, o[], p[];

    public static void main(String[] args) {
        // An array is an object. It means it also has a class!
        System.out.println(a.getClass());
        System.out.println(a.getClass().getName());

        boolean[][] bl=new boolean[5][];
        System.out.println(bl.getClass());
        System.out.println(bl.getClass().getName());

        // args is also an array
        System.out.println(args.length); // 0, because no command line arguments are passed

        // Printing examples---------------------------------------------------- 
        int[] arr=new int[10];
        System.out.println(arr); //[I@3feba861         // dimension dataType @ hashCode in hex form
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int[][] arr2=new int[3][2];
        System.out.println(arr2); //[[I@5b480cf9
        System.out.println(arr2[0]); //[I@6f496d9f
        System.out.println(arr2[0][0]); //0

        int[][] arr3=new int[3][];
        System.out.println(arr3); //[[I@723279cf
        System.out.println(arr3[0]); //null
//        System.out.println(arr3[0][0]); //NullPointerException

        // Glitch-----------------------------------------------------
        int[] xy={1,2,3,4,5};//valid
        int[] xyz;
//        xyz={1,2,3,4,5}; // illegal start of expression

        // Annonymous array--------------------------------------------
//        new int[]{1,2,3,4,4,5,5};
//        we can name it later by...
        int[] xyza=new int[]{1,2,3,4,4,5,5};

        // fun stuff---------------------------------------------------
        Object[] ar=new Object[5];
        ar[0]=new double[2];
        ar[1]=new String("Pushkar");
        // Object class ke array me uske koi bhi child class ke elements reh sakte h

        // similarly---------------------------------------------------
        Number[] num=new Number[5];
//        num[0]=new Integer(1);
//        num[1]=new Double(5);
//        num[2]=new String("Anuj");
        //incompatible types: java.lang.String cannot be converted to java.lang.Number

        // Cheap copy-------------------------------------------------
        // cannot redeclare as any other primitive type
        // int[] num=new int[4];
        // double[] numb=num; // invalid
        // But if the array is of the object type then a cheap copy array of type parent class of that class is valid
        Integer[] number=new Integer[5];
        Number[] numb=number; // valid
    }
}
