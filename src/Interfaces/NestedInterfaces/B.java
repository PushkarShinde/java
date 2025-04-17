package Interfaces.NestedInterfaces;

public class B implements A.NestedInterface{
    @Override
    public boolean isPrime(int num) {
        for(int i=1;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
