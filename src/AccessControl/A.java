package AccessControl;

public class A {
    protected int num; // if Private, only allowed to use in this class
    String name;
    int[] arr;

    A(int num, String name, int[] arr){
        this.num=num;
        this.name=name;
        this.arr=arr;
    }
    A(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }

    public A() {
        this.num=24;
        this.name="Pushkar";
        this.arr=new int[10];
    }

    public int getNum(){
        return this.num;
    }
}
