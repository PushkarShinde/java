package Cloning;

public class DeepCopyHuman implements Cloneable{
    int age;
    String name;
    int[] arr;

    public DeepCopyHuman(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{12,24,26,31};
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        DeepCopyHuman twin=(DeepCopyHuman) super.clone();
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
