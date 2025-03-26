public class Shadowing {
    static int a=10;
    public static void main(String[] args){
        System.out.println(a); // 10
        int a=20;
        System.out.println(a); // 20
        fun(); // 10
    }
    static void fun(){
        System.out.println(a);
    }

    // this is called shadowing!!
}
