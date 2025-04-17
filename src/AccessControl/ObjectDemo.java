package AccessControl;

public class ObjectDemo {
    int num;
    float marks;
    public ObjectDemo(int num, float marks) {
        this.num = num;
        this.marks=marks;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;
//        return this.num==obj.num; // this line didn't work so we casted it to our class object type
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
    ALREADY KNOW THESE TWO
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    */

    public static void main(String[] args) {
        ObjectDemo obj1=new ObjectDemo(24, 9.9f);
        ObjectDemo obj2=new ObjectDemo(24, 8.9f);
        System.out.println(obj1.hashCode()); //1791741888
        System.out.println(obj2.hashCode()); //1595428806

        if(obj1==obj2){ // False
            System.out.println("Object 1 is equal to Object 2");
        }else{
            System.out.println("False");
        }
        if(obj1.equals(obj2)){ // Object 1 is equal to Object 2
            System.out.println("Object 1 is equal to Object 2");
        }else{
            System.out.println("False");
        }


        System.out.println(obj1.getClass());
    }
}
