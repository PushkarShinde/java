package StaticMembers;

// this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a =4;
    static int b;
    static{
        System.out.println("I am in a static block!");
        b=a*7;
    }

    public StaticBlock() {
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        StaticBlock sb=new StaticBlock();
        StaticBlock sb1=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock sb2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
