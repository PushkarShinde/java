package Generics;

import java.util.List;
import java.util.ArrayList;

public class UpperBoundedWildcardExample {
    // Method to calculate the sum of a list of numbers
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue(); // Safe because Number defines doubleValue()
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        List<String> str=new ArrayList<>(); //didn't cause any error but the method above will not work for List of type <String>
        str.add("Pushkar");
        str.add("Anuj");

//        System.out.println("Sum of str: " + sumOfList(str)); // Compile error
        System.out.println("Sum of intList: " + sumOfList(intList)); // Output: Sum of intList: 6.0
        System.out.println("Sum of doubleList: " + sumOfList(doubleList)); // Output: Sum of doubleList: 6.6
    }
}

