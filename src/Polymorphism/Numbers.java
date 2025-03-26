package Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int ...c){
        int sum=a+b;
        for(int i:c){
            sum+=i;
        }
        return sum;
    }
}
