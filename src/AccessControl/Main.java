package AccessControl;

public class Main {
    public static void main(String[] args) {
        A obj=new A(24, "Pushkar");
//      obj.num // this is private hencer unreachabke
        System.out.println("My Birthday is on: "+obj.getNum());

    }
}
