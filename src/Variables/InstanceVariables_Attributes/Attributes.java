package Variables.InstanceVariables_Attributes;

public class Attributes {
    int x; // An instance variable, also called as Attributes
    int[] ar=new int[2];
    int[] arr;

    public static void main(String[] args) {
//        System.out.println(x);
//        CE: Non-static variable is referenced from a static method

        Attributes at=new Attributes();
        System.out.println(at.x); // 0...No error, JVM will simply print the default value

        System.out.println(at.ar);//[I@3feba861
        System.out.println(at.ar[0]);//0
        System.out.println(at.arr);//null
        System.out.println(at.arr[0]);//NullPointerException
    }

    public void m(){
        System.out.println(x); // valid...kyuki m() is an instance method
    }
}

// Stored in HEAP AREA