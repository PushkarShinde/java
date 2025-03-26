class Calculate {
    int a;
    int b;
    public int add(){
        System.out.println(a+b);
        return 0;
    }
}
public class oops{
    public static void main(String a[]){
        Calculate cal = new Calculate();
        cal.a=5;
        cal.b=10;
        cal.add();
    }
}