import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,4,54,56,23,1,2213);
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
