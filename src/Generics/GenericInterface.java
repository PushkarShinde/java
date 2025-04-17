package Generics;

public interface GenericInterface<T> {
    void display(T name);
}

class ImplementGenInterface implements GenericInterface<Number>{
    @Override
    public void display(Number name) {
        System.out.println(name);
    }
}