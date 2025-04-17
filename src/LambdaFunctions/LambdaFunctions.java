package LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaFunctions {

    public static void main(String[] args) {
        // Example list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Using Runnable to execute a block of code
        System.out.println("Using Runnable:");
        Runnable helloWorld = () -> System.out.println("Hello, World!");
        helloWorld.run();

        // Using Consumer to print each fruit
        System.out.println("\nUsing Consumer:");
        Consumer<String> printFruit = fruit -> System.out.println(fruit);
        fruits.forEach(printFruit);

        // Using Predicate to filter fruits starting with 'A' or 'B'
        System.out.println("\nUsing Predicate:");
        Predicate<String> startsWithAB = fruit -> fruit.startsWith("A") || fruit.startsWith("B");
        List<String> filteredFruits = fruits.stream()
                .filter(startsWithAB)
                .collect(Collectors.toList());
        System.out.println("Fruits starting with A or B: " + filteredFruits);

        // Using Function to convert fruits to uppercase
        System.out.println("\nUsing Function:");
        Function<String, String> toUppercase = fruit -> fruit.toUpperCase();
        List<String> uppercaseFruits = fruits.stream()
                .map(toUppercase)
                .collect(Collectors.toList());
        System.out.println("Fruits in uppercase: " + uppercaseFruits);

        // Using lambda with multiple parameters (not directly applicable here, but shown with a simple example)
        System.out.println("\nUsing lambda with multiple parameters (simple example):");
        // Define a functional interface for a method with two parameters
        interface Adder {
            int add(int a, int b);
        }
        Adder adder = (a, b) -> a + b;
        System.out.println("Sum of 5 and 7: " + adder.add(5, 7));

        // Using lambda in event handling context (simplified example)
        System.out.println("\nUsing lambda in event handling context (simplified):");
        // Simulating a button click handler
        interface ButtonClickHandler {
            void onClick();
        }
        ButtonClickHandler buttonClickHandler = () -> System.out.println("Button clicked!");
        buttonClickHandler.onClick();


        Operation sum=(a, b)->a+b;
        Operation prod=(a, b)->a*b;
        Operation sub=(a, b)->a-b;
        LambdaFunctions calculator=new LambdaFunctions();
        System.out.println("The sum of "+5+" and "+10+" is: "+ calculator.operate(5,10,sum));
        System.out.println("The prod of "+5+" and "+10+" is: "+ calculator.operate(5,10,prod));
        System.out.println("The sub of "+5+" and "+10+" is: "+ calculator.operate(5,10,sub));
    }
    private int operate(int a, int b, Operation op){
        return op.operate(a,b);
    }
}

interface Operation{
    int operate(int a, int b);
}
