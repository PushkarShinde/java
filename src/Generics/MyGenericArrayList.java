package Generics;

import java.util.Arrays;

public class MyGenericArrayList<T> {
    // ArrayList list=new ArrayList() // this is a direct instantiation of the class ArrayList, Not type safe
    // ArrayList<Integer> list=new ArrayList<>() // this is type safe
    private Object[] data;
    private static int DEFAULT_SIZE=10; // independent of the object
    private int size=0; // index value

    public MyGenericArrayList() {
        this.data= new Object[DEFAULT_SIZE]; // ratt lo!
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++){ // copying new data in array
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        return (T)data[size--];
    }
    public T get(int ind){
        if(ind>size || ind<0) {
            throw new IndexOutOfBoundsException("Index " + ind + " is out of bounds for size " + size);
        }
        return (T)data[ind];
    }
    public int size(){
        return size;
    }
    public void set(int ind,T val){
        data[ind]=val;
    }

    @Override
    public String toString() {
        return "MyArrayList{"+"data="+ Arrays.toString(data)+", size="+size+"}";
    }

    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
//        list.add(24);
//        list.remove(0);
//        list.set(0,24);
//        list.get(0);
//        list.size();
//        list.isEmpty();

//        MyGenericArrayList list=new MyGenericArrayList();
        MyGenericArrayList<Integer> list=new MyGenericArrayList<>();
        for(int i=0;i<12;i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}
